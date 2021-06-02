package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class extraTask {

    public static void main(String[] args) {

        String[] names = new String[3];
        names[0] = "Vladimir";
        names[1] = "Sanjar";
        names[2] = "Aleks";

        String[] names1 = new String[1];
        names1[0] = "Mikhail";

        List list = new ArrayList(Arrays.asList(names));
        list.addAll(Arrays.asList(names1));
        Object[] realNames = list.toArray();



        System.out.println("Здравствуйте, " + Arrays.toString(realNames));

        for (Object name : realNames
        ) {
            if ("Vladimir".equals(name)) {
                System.out.println("Доброго утра, " + names[0]);
            } else if ("Sanjar".equals(name)) {
                System.out.println("Доброго дня, " + names[1]);
            } else if ("Aleks".equals(name)) {
                System.out.println("Доброго вечера, " + names[2]);
            } else if ("Mikhail".equals(name)) {
                System.out.println("Доброй ночи, " + names1[0]);
            }
        }
    }
}
