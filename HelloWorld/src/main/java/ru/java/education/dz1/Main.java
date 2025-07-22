package ru.java.education.dz1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner src = new Scanner(System.in);

        System.out.println("Привет, " + src.next() + "!");

        src.close();
    }
}