package com.hgk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {


//        GasolineEngine gasolineEngine = new GasolineEngine();
//        DieselEngine dieselEngine = new DieselEngine();
//
//
//        StandartEngine[] engines = {gasolineEngine,dieselEngine};
//
//        for(StandartEngine e:engines){
//            System.out.println("ToString:" + e.toString());
//            if(e instanceof GasolineEngine)
//            {
//                e.;
//            }
//            else if(e instanceof DieselEngine)
//            {
////                ((DieselEngine)e).HeatUpInjectors();
//                e.StartEngine();
//            }

        String[] names = {"Gani", "Semih", "Huseyin", "Hakan", "Cagri"};
        List<String> stringList = new ArrayList<>(Arrays.asList(names));
        stringList.replaceAll(s -> s.toUpperCase());
        for (String s : stringList) {
            System.out.println(s);
        }
        System.out.println("========================");
        stringList.removeIf(s->s.equals("GANI"));
        for (String s : stringList) {
            System.out.println(s);
        }
    }

}
