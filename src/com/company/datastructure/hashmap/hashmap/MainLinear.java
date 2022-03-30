package com.company.datastructure.hashmap.hashmap;

import java.util.Scanner;

public class MainLinear {
    public static void main(String[] args) {

        int choice, key;

        HashMapLinear h = new HashMapLinear(7);
        Scanner In = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your Choice :");
            System.out.println("1. Add key");
            System.out.println("2. Delete key");
            System.out.println("3. Print table");
            System.out.println("4. Exit");
            System.out.println("5. Search and print key index");
            System.out.println("6. Check load factor");

            choice = In.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Enter the key: ");
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
                    System.out.println("Print hashmap: ");
                    h.displayHashtable();
                    break;
                }
                case 4: {
                    In.close();
                    return;
                }
                case 5: {
                    System.out.println("Enter the key to find and print it: ");
                    key = In.nextInt();
                    System.out.println("Key: " + key + " ,index: " + h.findHash(key));
                    break;
                }
                case 6: {
                    h.checkLoadFactor();
                    break;
                }
            }
        }
    }
}
