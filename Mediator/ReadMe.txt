The Mediator pattern removes direct communication between objects and forces them to communicate through a mediator

Instead of
Component A -> Component B
Component B -> Component C
Component C -> Component A

You get:
Component -> Mediator -> Component
This reduces tight coupling, complex dependencies, and spaghetti interactions

Use it when:
Many objects interact in complex ways
you want to centralize communication logic
you want to avoid circular dependencies
you want to simplify object relationships

Commmon in:
- UI frameworks
- Chat systems
- Workflow Engines
- Event - driven systems
- Air traffic control systems

Mediator
    |
ConcreteMediator
    |
Colleague (Component)
    |
ConcreteCollegueA, ConcreteColleagueB







