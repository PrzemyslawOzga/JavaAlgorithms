package com.company.datastructure.hashmap.hashmap;

import java.util.Scanner;

public class Main {
    public static void Main(String[] args) {
        int choice, key;

        HashMap h = new HashMap(7);
        Scanner In = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your Choice :");
            System.out.println("1. Add key");
            System.out.println("2. Delete key");
            System.out.println("3. Print table");
            System.out.println("4. Exit");

            choice = In.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Enter the key:");
                    key = In.nextInt();
                    h.insertHash(key);
                    break;
                }
                case 2: {
                    System.out.println("Enter the key to delete: ");
                    key = In.nextInt();
                    h.deleteHash(key);
                    break;
                }
                case 3: {
                    System.out.println("Print table: ");
                    h.displayHashtable();
                    break;
                }
                case 4: {
                    In.close();
                    return;
                }
            }
        }
    }
}
