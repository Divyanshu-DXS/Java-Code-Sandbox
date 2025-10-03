# Singleton Design Pattern 

This is a creational design pattern. Which revolves around the idea of having just a single object for a class for reference. 
Even if multiple objects are trying to access it, or call for the constructor, the same object is referenced and no new objects are created. 

This pattern is particularly useful when exactly one object is needed to coordinate actions across the system—such as in logging, configuration managers, caching, or thread pools.

This functionality is achieved by : 
- making the constructor private // does not let any other classes to create different objects or call the constructor 
- by creating a static method that helps us get the object of the class created since the constructor is privare and can not be called externally 
- the object created is also specified as private and static 


This usually can be approached in 3 different ways as demonstrated in different classes 
- Lazy approach 
- Eager approach 
- thread Safe approach 

