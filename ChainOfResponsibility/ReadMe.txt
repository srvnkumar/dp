Chain of Responsibility  Pattern in Java

The chain of Responsibility pattern is a behavioral design pattern that allows passing request along the chain of potential handlers until one of them handles the request. The pattern decouples sender and receiver of a request based on type of request.
lets you send a request through a pipeline of handlers, where each handler decides either to process the request or pass it forward.

GOF:
Avoid coupling the sender of a request to its receiver by giving more than one object a chance to ahandle the request. Chain
the receiving objects and pass the request along the chain until an object handles it.

When to use:
- When more than one object may handle a request, and the handler is not known a priori
- When you want to issue a request to one of several objects without specifying the receiver explicitly