The Facade pattern provides a simple, unified interface to a complex subsystem

Instead of exposing dozens of classes, configurations, and workflows, you expose one clean API

With out Facade
Client -> Many complex classes -> Hard to use

With Facade

Client -> facade -> Subsystem (hiddencomplexity)

use it when
- hide complexity
- clean API for clients
- reduce coupling
- simplify usage of multiple subsystems
- to enforce a workflow

UML Structure
Client -> Facade -> SubsystemA, SubsystemB, SubsystemC