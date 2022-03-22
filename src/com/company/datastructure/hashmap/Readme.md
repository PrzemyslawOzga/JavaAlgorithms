## **JAVA HASHMAP DATA STRUCTURE**

HashMap is a data structure that organizes it and allows you to quickly find values 
for a given key. HashMapa is based on an array of objects of the HashMap.Node static 
class, which implements the Map.ENTRY interface and the key hashing mechanism used to 
find the index of the array. Thanks to this solution, the storage and extraction of 
objects (if we know the key) with the complexity O (1) is ensured.


The size of the inner array is always a power of two (if we give e.g. the number 
18 in the constructor, the inner array allocates memory to 32 elements because 
it is the closest power of two greater than the given number 18), thanks to this 
the HashMap is able to provide us with complexity at the level of O (1).

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

### **LinkedList** 

Linked List is a part of the Collection framework present in java.util package. 
This class is an implementation of the LinkedList data structure which is a linear 
data structure where the elements are not stored in contiguous locations and every 
element is a separate object with a data part and address part. The elements are 
linked using pointers and addresses. Each element is known as a node. Due to the 
dynamicity and ease of insertions and deletions, they are preferred over the arrays. 
It also has a few disadvantages like the nodes cannot be accessed directly instead we 
need to start from the head and follow through the link to reach a node we wish to access.

### **How Does LinkedList work Internally?**

Since a LinkedList acts as a dynamic array and we do not have to specify the size 
while creating it, the size of the list automatically increases when we dynamically 
add and remove items. And also, the elements are not stored in a continuous fashion. 
Therefore, there is no need to increase the size. Internally, the LinkedList is 
implemented using the doubly linked list data structure. The main difference between 
a normal linked list and a doubly LinkedList is that a doubly linked list contains 
an extra pointer, typically called the previous pointer, together with the next pointer 
and data which are there in the singly linked list. 