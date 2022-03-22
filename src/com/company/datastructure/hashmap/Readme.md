## **JAVA HASHMAP DATA STRUCTURE**

HashMap is a data structure that organizes it and allows you to quickly find values for a given key.

### **Advantages of HashMaps**

- Fast value search (average O (1))
- Flexible Keys: Keys can be used with most data types, as long as they can be hashed

### **Weaknesses of HashMap**

- The worst case of time complexity is O(n)
- Keys are stored in random order. Whether we are looking for the biggest or the smallest - you need to go through them all.
- One-way search: Although you can search for a value for a given key in O (1) time, searching for a key for a given value requires traversing the entire dataset in O (n) time.
- Cache-Unfriendly: Many implementations of hash tables use concatenated lists that do not put data side by side in memory.

### **Structure of HashMap** 

Internally, the HashMap contains the Node array and the node is represented as a class containing 4 fields:

- int hash
- k key
- v value
- node next