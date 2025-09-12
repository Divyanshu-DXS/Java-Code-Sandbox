# Internal Working Of A HashMap

In Java HashMap is a component of the Java Collection framework. It serves as a standard implementation of the Map interface. 
A hashmap organizes its data in key value pairs. Every key is unique that corresponds to values assigned to them. 
In case a duplicate key is entered the corresponding value for that key gets overwritten. 
It has an average time complexity of O(1) for insertion and retrieval.  

## How HashMap works internally?
   
Internally a HashMap implements a HashTable internally which comprises of 2 important data structures linkedList and Arrays.
<code>ARRAY OF LINKED LIST</code>
<u>Organised into arrays of buckets, where each element represents a separate node.</u> 
#### InnerNode Important
Within the LinkedList the inner Node class includes attributes such as a hash value, key, value and reference to the next node.

## What happens when a user attempts to add a key-value pair to hashmap.

### // Buckets
- Hashmap initially initializes 16  buckets (0-15) in heap memory. 
- Each of these buckets refer to a singly linked list.
    - These linked list contains the entries( [the nodes](#InnerNode-Important) ). 
- All of these buckets are equally capable of accomodating one or multiple key-valued pairs.

### // Load Factor and Rehashing
-  Default load capacitor is 75% of its capacity.
- When the hashmap's capacity is reached, the load factor * the current capacity and hence resizes the hashmap. 
- when resizing happens the hashmap also rehashes. 
    - rehashing is the process of re-calculating hash codes for already stored elements that also determines where the new entries would go.
- when initialiing a hahsmap in java the constructor gives us an optoin to set both, the load factor and the initial capacity.
<code>Map<KeyType, ValueType> hashMap = new HashMap<>(16, 0.75f);
</code>

### // Hashing
- Hashing is the technique to generate the hash code of an object. 
- When the put method is used to add a key value pair in the hashmap, the hashmap class computes the hash for code that determines the index of the bucket where the key value pair be stored in the array. 
- This is achieved by the hashcode() method.
- this method retruns the computed result (the memory reference of the object) in an integer form.
- this determines the index of the bucket within the array, where the value will be stored. 
- this hashcode function can also be overwritten with own personal implementation if needed.

### // Collision
- A collision can occur when one or more keys compute to the same hash but the keys are not equal. 
- Hashmap manages these collisoin by using a technique of chaining.
- In case where the hash computes to be the same, multiple key value pairs are then stored in a linked list within the same bucket. 
- when retreiving a value associated with a key, the hashmap iterates through a linkedList in that bucket to find the correct pair. 

### // equals() 
- In case of collisions the equals method is used to check if the element on tha positon is equal.
- if equal, then the value will be overwritten, and if not this will result in a collision.
- Hashmaps in java do not allow duplicate keys so each key should be unique. 
- This ensures that each key is associated with only one value, facilitating efficient retrieval of values based on keys. 


#### MORE ON HASHING

Hashing is changing the form of data. There are a lof of algorithms that help us with hashing. 

    - SHA1
    - SHA256 , etc. 

The concept of hashing is widely used in order to store passwords. What hashing in this does it change the password enetred and stores it in its hashed form. 

- We use hashfunction to compute buckets and more data to determine the bucket indices for a key
- once the bucket index is calculated, it then searches at that index and checks if the key is present or not, if yes - it updates the value, if not it creates a new key value pair. 
- When the threshold of the capacity is breached, then the arrays are resized with a new capacity and reshashing happens
- rehashing may change the bucket indexes of the already stored elements and store them in different buckets. 

