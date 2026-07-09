The Template Method Pattern in Java is one of the most elegant behavioral patterns.
It defines the skeleton of an algorithm in a base class and lets subclasses override specific
steps without changing the algorithm's structure.

Structure:
-> Abstract Class : defines template method + primitive operations
-> Concrete Classes -> override specific steps
-> Template Method -> final method that defines the algorithm flow