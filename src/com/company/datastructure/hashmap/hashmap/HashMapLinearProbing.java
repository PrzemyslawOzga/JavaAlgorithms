package com.company.datastructure.hashmap.hashmap;

import java.util.*;

public class HashMapLinearProbing {

    /*
    hashSize - size of the hash table
    buckets - array representing the table
    size - amount of elements in the hash table
    */

    private int hashSize;
    private Integer[] buckets;
    private Integer AVAILABLE;
    private int size;

    // Constructor
    public HashMapLinearProbing(int hashSize) {
        this.buckets = new Integer[hashSize];
        this.hashSize = hashSize;
        this.AVAILABLE = Integer.MIN_VALUE;
        this.size = 0;
    }

    //
    public int hashing(int key) {
        int hash = key % hashSize;
        if (hash < 0) {
            hash += hashSize;
        }
        return hash;
    }

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

    public void displayHashtable() {
        for (int i = 0; i < hashSize; i++) {
            if (buckets[i] == null || buckets[i] == AVAILABLE) {
                System.out.println("Bucket " + i + ": Empty");
            } else {
                System.out.println("Bucket " + i + ": " + buckets[i].toString());
            }
        }
    }

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

    public void checkLoadFactor() {
        double factor = (double) size / hashSize;
        if (factor > .7) {
            System.out.println("Load factor is " + factor + ",  lengthening table");
            lengthenTable();
        } else {
            System.out.println("Load factor is " + factor);
        }
    }

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
