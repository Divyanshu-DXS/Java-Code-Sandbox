# Prototype Design Pattern 

Prototype is a creational design pattern that lets you copy existing objects without making your code dependent on their classes.

The Prototype pattern delegates the cloning process to the actual objects that are being cloned. The pattern declares a common interface for all objects that support cloning. 
This interface lets you clone an object without coupling your code to the class of that object. Usually, such an interface contains just a single clone method.

An object that supports cloning is called a prototype. When your objects have dozens of fields and hundreds of possible configurations, cloning them might serve as an alternative to subclassing.

# Shallow copy vs Deep copy 

## Shallow copy
A shallow copy creates a new object and copies the values of the original object's fields into the new object.
If a field is a primitive type (like int, boolean, double), its value is directly copied.
If a field is a reference type (like an Object, String, or array), only the reference address (memory address) to that object is copied, not the object itself.
This means both the original and the copied object will point to the same underlying object for their reference-type fields.
Consequently, if you modify the object referenced by a field in either the original or the copied object, the change will be reflected in both, as they share that common referenced object.

## Deep copy
A deep copy creates a new object and recursively copies all fields, including creating new independent copies of any objects referenced by reference-type fields.
This means that for every reference-type field, a new instance of the referenced object is created and its values are copied.
The original and copied objects become entirely independent. Changes made to a nested object in one will not affect the other.