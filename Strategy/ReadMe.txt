The Strategy Pattern lets you define a family of algorithms, encapsulate
each one, and switch between them dynamically without modifying the client code.

Its essentially polymorphism for algorithms.

Structure

Strategy (interface) - defines the algorithm.
Concrete Strategies - different implementations.
Context - Uses as Strategy; can switch Strategies at runtime.

