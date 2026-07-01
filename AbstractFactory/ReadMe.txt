Provide an interface for creating families of related or dependent objects without specifying their concrete classes. The Abstract Factory pattern is used to encapsulate a group of individual factories that have a common theme. It allows clients to create objects from these factories without knowing the specific classes being instantiated.

Abstract factory defers creation of product objects to its ConcreteFactory subclasses. Each ConcreteFactory corresponds to a specific family of products and implements the creation methods for those products.

Use Abstract factory when:
- You want to provide a library of products that are designed to work together, and you want to enforce this relationship.
- You want to isolate the concrete classes that are used to create products from the code that uses
them, allowing for greater flexibility and easier maintenance.
- You want to create a system that can be easily extended with new families of products without modifying existing code.


Difficulty:
- Supporting new kinds of products is difficult because it requires changes to the abstract factory interface and all concrete factories.
