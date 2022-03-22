## **JAVA HASHMAP DATA STRUCTURE**

HashMap is a data structure that organizes it and allows you to quickly find values 
for a given key. HashMapa is based on an array of objects of the HashMap.Node static 
class, which implements the Map.ENTRY interface and the key hashing mechanism used to 
find the index of the array. Thanks to this solution, the storage and extraction of 
objects (if we know the key) with the complexity O (1) is ensured.

### **Advantages of HashMaps**

- Fast value search (average O (1))
- Flexible Keys: Keys can be used with most data types, as long as they can be hashed

### **Weaknesses of HashMap**

- The worst case of time complexity is O(n)
- Keys are stored in random order. Whether we are looking for the biggest or the
  smallest- you need to go through them all.
- One-way search: Although you can search for a value for a given key in O (1) 
  time, searching for a key for a given value requires traversing the entire 
  dataset in O (n) time.
- Cache-Unfriendly: Many implementations of hash tables use concatenated lists 
  that do not put data side by side in memory.

### **Structure of HashMap** 

Internally, the HashMap contains the Node array and the node is represented as 
a class containing 4 fields:

- int hash
- k key
- v value
- node next

### **How hashMap works?** 

- Hash - an integer, easily calculated when adding an element to the map using 
        the HashMap.hash (key) method, this method calculates the hash of the object 
        and assigns it a short deterministic value that always has a fixed size, the 
        so-called irreversible abbreviation. In this particular implementation, a logical 
        right bit shift is used for this.
- key - good candidates for keys will surely be immutable objects fulfilling 
        the hashCode and equal contracts. In short, if two different objects return the 
        same HashCode then these objects can be equivalent, then equals can return true or false. 
        However, if the HashCode of the two objects is different, then equals will always 
        return false. Good candidates for keys are String, Integer, and other primitive Wrappers. 
        String is probably the most used key type in a map because it is immutable and has 
        correctly implemented equals and hashCode methods and is readable. The immutability 
        of objects is crucial to prevent the fields used to compute hashCodes from being 
        changed over the course of the program, as codes are computed while inserting and 
        retrieving elements from the map. If the fields in the key change between these 
        operations, we will not be able to find the requested object, because the hashCode 
        calculated before and after will be different.
- value - any object or null
- next - reference for the next node