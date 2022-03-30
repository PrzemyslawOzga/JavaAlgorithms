package com.company.datastructure.hashmap.hashmap;

/*
This class is an implementation of a hash table using linear probing It uses a
dynamic array to lengthen the size of the hash table when load factor > 0.7

hashSize - size of the hash table
buckets - array representing the table
size - amount of elements in the hash table
*/

import java.util.*;

public class HashMapLinear {
    private int hashSize;
    private Integer[] buckets;
    private Integer AVAILABLE;
    private int size;

    // Constructor
    public HashMapLinear(int hashSize) {
        this.buckets = new Integer[hashSize];
        this.hashSize = hashSize;
        this.AVAILABLE = Integer.MIN_VALUE;
        this.size = 0;
    }

    // The hashing function takes a given key and finds an index based on its data
    public int hashing(int key) {
        int hash = key % hashSize;
        if (hash < 0) {
            hash += hashSize;
        }
        return hash;
    }

    // inserts the key into the hashmap by wrapping it as an Integer object
    public void insertHash(int key) {
        Integer wrappedInt = key;
        int hash = hashing(key);

        if (isFull()) {
            System.out.println("Hash table is full");
            return;
        }

        for (int i = 0; i < hashSize; i++) {
            if (buckets[hash] == null || buckets[hash] == AVAILABLE) {
                buckets[hash] = wrappedInt;
                size++;
                return;
            }

            if (hash + 1 < hashSize) {
                hash++;
            } else {
                hash = 0;
            }
        }
    }

    // deletes a key from the hash map and adds an available placeholder
    public void deleteHash(int key) {
        Integer wrappedInt = key;
        int hash = hashing(key);

        if (isEmpty()) {
            System.out.println("Table is empty");
            return;
        }

        for (int i = 0; i < hashSize; i++) {
            if (buckets[hash] != null && buckets[hash].equals(wrappedInt)) {
                buckets[hash] = AVAILABLE;
                size--;
                return;
            }

            if (hash + 1 < hashSize) {
                hash++;
            } else {
                hash = 0;
            }
        }
        System.out.println("Key " + key + " not found");
    }

    // display the hash table line by line
    public void displayHashtable() {
        for (int i = 0; i < hashSize; i++) {
            if (buckets[i] == null || buckets[i] == AVAILABLE) {
                System.out.println("Bucket " + i + ": Empty");
            } else {
                System.out.println("Bucket " + i + ": " + buckets[i].toString());
            }
        }
    }

    // finds the index of location based on an inputed key
    public int findHash(int key) {
        Integer wrappedInt = key;
        int hash = hashing(key);

        if (isEmpty()) {
            System.out.println("Table is empty");
            return -1;
        }

        for (int i = 0; i < hashSize; i++) {
            try {
                if (buckets[hash].equals(wrappedInt)) {
                    buckets[hash] = AVAILABLE;
                    return hash;
                }
            } catch (Exception E) {
            }

            if (hash + 1 < hashSize) {
                hash++;
            } else {
                hash = 0;
            }
        }
        System.out.println("Key " + key + " not found");
        return -1;
    }

    private void lengthenTable() {
        buckets = Arrays.copyOf(buckets, hashSize * 2);
        hashSize *= 2;
        System.out.println("Table size is now: " + hashSize);
    }

    /*
    checkLoadFactor checks the load factor of the hash table if greater than 0.7
    automatically lengthens table to prevent further collisions
    */
    public void checkLoadFactor() {
        double factor = (double) size / hashSize;
        if (factor > .7) {
            System.out.println("Load factor is " + factor + ",  lengthening table");
            lengthenTable();
        } else {
            System.out.println("Load factor is " + factor);
        }
    }

    // isFull returns true if the hash map is full and false if not full
    public boolean isFull() {
        boolean response = true;
        for (int i = 0; i < hashSize; i++) {
            if (buckets[i] == null || buckets[i] == AVAILABLE) {
                response = false;
                break;
            }
        }
        return response;
    }

    // isEmpty returns true if the hash map is empty and false if not empty
    public boolean isEmpty() {
        boolean response = true;
        for (int i = 0; i < hashSize; i++) {
            if (buckets[i] != null) {
                response = false;
                break;
            }
        }
        return response;
    }
}
