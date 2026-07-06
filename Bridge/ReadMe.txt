Bridge pattern
- Bridge pattern decouples an abstraction from its implementation so that the two can vary independently. It is a structural design pattern that allows you to separate the interface of a class from its implementation, enabling you to change the implementation without affecting the clients that use the interface.
- The Bridge pattern is useful when you want to avoid a permanent binding between an abstraction and its implementation. Instead of creating a fixed relationship between the two, you can define an interface for the abstraction and implement it in different ways, allowing you to switch between implementations at runtime.
- The Bridge pattern can be implemented by creating an interface for the abstraction and a separate interface for the implementation. The abstraction holds a reference to the implementation interface and delegates the calls to it. This allows you to change the implementation without affecting the clients that use the abstraction.
- The Bridge pattern promotes code reusability and flexibility by allowing you to create new abstractions and implementations without modifying existing code. It also helps to decouple the client code from the implementation details of the abstraction, making it easier to maintain and extend the system in the future.

Use it when:

You have two independent dimensions (e.g., Shape × Color, Payment × Gateway, Message × Channel).
You want to avoid subclass explosion.
You want to switch implementations at runtime.
You want to extend abstraction and implementation independently.

Real word examples
Payment system
Abstraction: Payment
Implementor: PaymentGateway (Stripe, Razorpay)

Messaging system
Abstraction: Message
Implementor: Sender (Email, SMS, Push)

Database drivers
Abstraction: QueryExecutor
Implementor: DBDriver (MySQL, PostgreSQL)