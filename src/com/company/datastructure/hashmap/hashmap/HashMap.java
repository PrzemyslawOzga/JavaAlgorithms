package com.company.datastructure.hashmap.hashmap;

/*
HashMap stores elements in so-called buckets and the number of buckets is called capacity.
When we put a value in the map, the key's hashCode() method is used to determine the
bucket in which the value will be stored. To retrieve the value, HashMap calculates the
bucket in the same way – using hashCode().
*/

public class HashMap {
    private int hashSize;
    private LinkedList[] buckets;

    public HashMap(int hashSize) {
        buckets = new LinkedList[hashSize];
        for (int i = 0; i < hashSize; i++)  {
            buckets[i] = new LinkedList();
            // In Java, we need to explicitly initialize each object.
        }
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
    public void insertHash (int key) {
        int hash = hashing(key);
        buckets[hash].insert(key);
    }

    // deletes a key from the hash map and adds an available placeholder
    public void deleteHash(int key) {
        int hash = hashing(key);

        buckets[hash].delete(key);
    }

    // display the hash table line by line
    public void displayHashtable() {
        for (int i = 0; i < hashSize; i++) {
            System.out.printf("Bucket: ", i);
            System.out.println(buckets[i].display());
        }
    }

    // Information about Linked list is in Readme.md
    public static class LinkedList {

        private Node first;
        public LinkedList() {
            first = null;
        }

        public void insert(int key) {
            if (isEmpty()) {
                first = new Node(key);
                return;
            }

            Node temp = findEnd(first);
            temp.setNext(new Node(key));
        }

        private Node findEnd(Node n) {
            if (n.getNext() == null) {
                return n;
            } else {
                return findEnd(n.getNext());
            }
        }

        public Node findKey(int key) {
            if (!isEmpty()) {
                return findKey(first, key);
            } else {
                System.out.println("List is empty");
                return null;
            }
        }

        private Node findKey(Node n, int key) {
            if (n.getKey() == key) {
                return n;
            } else if (n.getNext() == null) {
                System.out.println("Key not found");
                return null;
            } else {
                return findKey(n.getNext(), key);
            }
        }

        public void delete(int key) {
            if (!isEmpty()) {
                if (first.getKey() == key) {
                    first = null;
                } else {
                    delete(first, key);
                }
            } else {
                System.out.println("List is empty");
            }
        }

        private void delete(Node n, int key) {
            if (n.getNext().getKey() == key) {
                if (n.getNext().getNext() == null) {
                    n.setNext(null);
                } else {
                    n.setNext(n.getNext().getNext());
                }
            }
        }

        public String display() {
            return display(first);
        }

        private String display(Node n) {
            if (n == null) {
                return "null";
            } else {
                return n.getKey() + "->" + display(n.getNext());
            }
        }

        public boolean isEmpty() {
            return first == null;
        }
    }

    public static class Node {

        private Node next;
        private int key;

        public Node(int key) {
            next = null;
            this.key = key;
        }

        public Node getNext() {
            return next;
        }

        public int getKey() {
            return key;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

}
