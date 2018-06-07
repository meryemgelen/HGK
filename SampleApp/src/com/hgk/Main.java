package com.hgk;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    private static boolean exit = false;
    private static DataManager<Personal> personalManager;
    private static DataManager<Equipment> equipmentManager;
    private static BufferedReader br = null;
    public static void main(String[] args) {

        // DEFINING OUR VARIABLES
        List<MenuItem> menus = new ArrayList<>();
        List<Personal> personals = new ArrayList<>();
        List<Equipment> equipments = new ArrayList<>();
        personalManager= new DataManager(personals);
        equipmentManager= new DataManager(equipments);

        // POPULATING APP DATA
        PopulateMenuData(menus);
        PopulatePersonalData(personals);
        PopulateEquipmentData(equipments);

        try {
            br = new BufferedReader(new InputStreamReader(System.in)); //
            while (!exit) {
                GenerateMenu(menus, br, -1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();//Finally blogunda mutlaka BufferedReader ile actigimiz stream i kapatiyoruz.
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void GenerateMenu(List<MenuItem> menus, BufferedReader br, int parentId)
            throws IOException {
        clearConsole();
        if (parentId == 0)
            return;
        menus.stream()
                .filter(m -> m.getParentId() == parentId) //ParentID si paratme olarak verilen parentId ile ayni olanlari filtreliyoruz
                .sorted(Comparator.comparingInt(MenuItem::getDisplayOrder)) //Listemizi SORT ediyoruz.MenuItem in DisplayOrder'ina gore
                .forEach(m -> System.out.println(m.getId() + ". " + m.getName()));
        System.out.println("0. Exit");
        System.out.print("Choose:");
        int menuNumber = Integer.parseInt(br.readLine());
        if (parentId == -1 & menuNumber == 0)
            exit = true;
        menus.parallelStream()
                .filter(m->m.getId()==menuNumber)
                .findFirst().ifPresent(p->{
            if(p.Func()!=null)
            {
                ((List<?>)p.Func().get()).forEach(per->{
                    System.out.println(per);
                });
            }
        });
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
        menus.add(new MenuItem<List<Personal>>(1, 1, "Personel", -1,null));
        menus.add(new MenuItem<List<Personal>>(11, 1, "List", 1, ()->personalManager.getAll()));
        menus.add(new MenuItem<List<Personal>>(12, 2, "Add", 1,null));
        menus.add(new MenuItem<List<Personal>>(13, 3, "Delete", 1,null));
        menus.add(new MenuItem<List<Personal>>(
                14,
                4,
                "Filter ByID",
                1,
                ()->{
                    try {
                        System.out.print("Enter Personal Id:");
                        int personalId=Integer.parseInt(br.readLine());
                        return personalManager.getById(personalId);
                    } catch (IOException e) {
                        e.printStackTrace();
                        return null;
                    }
                }));
        menus.add(new MenuItem<List<Personal>>(
                15,
                5,
                "Search By keyword",
                1,
                ()->{
                    try {
                        System.out.print("Keyword:");
                        String keyword=br.readLine();
                        return personalManager.searchByKeyword(keyword);
                    } catch (IOException e) {
                        e.printStackTrace();
                        return null;
                    }
                }));


        menus.add(new MenuItem<List<Equipment>>(2, 2, "Equipment", -1,null));
        menus.add(new MenuItem<List<Equipment>>(21, 1, "List", 2,()->equipmentManager.getAll()));
        menus.add(new MenuItem<List<Equipment>>(22, 2, "Add", 2,null));
        menus.add(new MenuItem<List<Equipment>>(
                23,
                3,
                "Search By keyword",
                2,
                ()->{
                    try {
                        System.out.print("Keyword:");
                        String keyword=br.readLine();
                        return equipmentManager.searchByKeyword(keyword);
                    } catch (IOException e) {
                        e.printStackTrace();
                        return null;
                    }
                }));

        menus.add(new MenuItem<List<POIItem>>(3, 3, "POI", -1,null));
        menus.add(new MenuItem<List<POIItem>>(31, 1, "List", 3,null));
        menus.add(new MenuItem<List<POIItem>>(32, 2, "Add", 3,null));

    }

    public final static void clearConsole()
    {
        try
        {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows"))
            {
                Runtime.getRuntime().exec("cls");
            }
            else
            {
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e)
        {
            //  Handle any exceptions.
        }
    }

}
