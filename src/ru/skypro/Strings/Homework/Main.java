package ru.skypro.Strings.Homework;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // write your code here

        // задание 1
        System.out.println("задание 1");

        String firstName = "Ivan ";
        String middleName = "Ivanovich";
        String lastName = "Ivanov ";
        String fullName = lastName+firstName+middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        // задание 2
        System.out.println("задание 2");

        fullName = fullName.toUpperCase();
        System.out.println(fullName);

        // задание 3
        System.out.println("задание 3");

        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println(fullName);

        }
}
