package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String[] names = new String[3];
        names[0] = "Vladimir";
        names[1] = "Sanjar";
        names[2] = "Aleks";



                System.out.println("Здравствуйте, " + Arrays.toString(names));

        for (String name : names
        ) {
            switch (name) {
                case "Vladimir":
                    System.out.println("Доброго утра, " + names[0]);
                    break;
                case "Sanjar":
                    System.out.println("Доброго дня, " + names[1]);
                    break;
                case "Aleks":
                    System.out.println("Доброго вечера, " + names[2]);
                    break;

            }
        }
    }
}
