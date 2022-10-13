package com.abb;

public class Main {
    public static void main(String[] args) {
//        Human mother = new Human();
//        Human father = new Human("Vito", "Karleone", 1977);
//        Human child = new Human("Michael", "Karleone", 1990, mother, father);
//
//
//        Pet pet = new Pet("Dog", "Rock", 5, 75, new String[] {"eat", "drink", "sleep"} );
//
//        String[][] schedule = new String[2][2];
//        schedule[0][0] = "Monday";
//        schedule[0][1] = "Go to work";
//        schedule[1][0] = "Thuesday";
//        schedule[1][1] = "Meet with friends";
//        Human teacher = new Human("Jhon", "Jack", 1990, 86, pet, mother, father,schedule);
//
//
//        String[] arr = new String[2];
//        arr[0] = "sfsd";

//
        Human father = new Human("Vito", "Karleone", 1977);
        Human mother = new Human("Vito", "Karleone", 1977);

        Family familyFirst = new Family(mother, father);
        Family familySecond = new Family(mother, father);
        System.out.println(familyFirst.equals(familySecond));


//
//        System.out.println(mother);
//        System.out.println(father);
//        System.out.println(child);
//        System.out.println(pet);
//        System.out.println(teacher);
    }
}