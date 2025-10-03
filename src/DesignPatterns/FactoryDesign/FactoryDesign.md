# Factory Design Pattern

The Factory Design Pattern is a <em>creational design pattern</em> that provides a way to encapsulate the instantiation logic of objects. 
It promotes loose coupling by delegating the responsibility of object creation to a separate component called the Factory.

Instead of creating objects directly using the new keyword in client code, the client requests an object from the factory. 
The factory then decides which concrete implementation to return based on input parameters or runtime conditions.<br>
<code>In this case here 'EmployeeFactory' class returns an object based on what parameter is passed to the getEmployee().</code>

Typically, this pattern involves:

- An Interface or Abstract Class that defines the common contract (set of methods) for all objects that can be created.

- Concrete Implementations that realize the interface and provide specific behavior.

- A Factory Class or Method that contains logic to instantiate and return the appropriate object based on the provided input.

