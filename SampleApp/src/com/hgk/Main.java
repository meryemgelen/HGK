package com.hgk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static boolean exit=false;
    public static void main(String[] args) {

        List<MenuItem> menus = new ArrayList<>();
        List<Personal> personals = new ArrayList<>();
        List<Equipment> equipments = new ArrayList<>();
        PopulateMenuData(menus);
        PopulatePersonalData(personals);
        PopulateEquipmentData(equipments);

        BufferedReader br = null;
        try {

            br = new BufferedReader(new InputStreamReader(System.in));
            while (!exit) {
                GenerateMenu(menus, br, -1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void GenerateMenu(List<MenuItem> menus, BufferedReader br, int parentId)
            throws IOException {
        if(parentId==0)
            return;
        menus.stream()
                .filter(m -> m.getParentId() == parentId)
                .forEach(m -> System.out.println(m.getId() + ". " + m.getName()));
        System.out.println("0. Exit");
        System.out.print("Choose:");
        int menuNumber = Integer.parseInt(br.readLine());
        if(parentId==-1 & menuNumber==0)
            exit=true;
        GenerateMenu(menus, br, menuNumber);
    }

    private static void PopulateEquipmentData(List<Equipment> equipments) {
        equipments.add(new Equipment(1, "BMC", EquipmentType.TRUCK));
        equipments.add(new Equipment(2, "Tuzla Jip", EquipmentType.CAR));
        equipments.add(new Equipment(3, "Telsiz", EquipmentType.ELECTRICAL));
    }

    private static void PopulatePersonalData(List<Personal> personals) {
        personals.add(new Personal(1, "Mehmet", "Tombalak"));
        personals.add(new Personal(2, "Semih", "Isilak"));
        personals.add(new Personal(3, "Huseyin", "Cobanoglu"));
        personals.add(new Personal(4, "Hakan", "Erakcaoglu"));
        personals.add(new Personal(5, "Cagri", "Erbay"));
        personals.add(new Personal(6, "Sinan", "Karaer"));
    }

    private static void PopulateMenuData(List<MenuItem> menus) {
        menus.add(new MenuItem(1, 1, "Personel", -1));
        menus.add(new MenuItem(11, 1, "List", 1));
        menus.add(new MenuItem(12, 2, "Add", 1));
        menus.add(new MenuItem(13, 3, "Delete", 1));

        menus.add(new MenuItem(2, 2, "Equipment", -1));
        menus.add(new MenuItem(21, 1, "List", 2));
        menus.add(new MenuItem(22, 2, "Add", 2));


        menus.add(new MenuItem(3, 3, "POI", -1));
        menus.add(new MenuItem(31, 1, "List", 3));
        menus.add(new MenuItem(32, 2, "Add", 3));

    }
}
