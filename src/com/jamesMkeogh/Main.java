package com.jamesMkeogh;



import java.util.EnumMap;

public class Main {

    public static void main(String[] args) {
        EnumMap<CalYear,String> enumMap = new EnumMap<CalYear,String>(CalYear.class);

        enumMap.put(CalYear.AUG,"Still Hot");
        enumMap.put(CalYear.JAN,"Cold");
        enumMap.put(CalYear.JUNE,"Hot");

        System.out.println("the map has "+enumMap);
    }

}
