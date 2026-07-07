The command pattern encapsulates a request as an object so you can queue, log undo
or execute it later, It decouples the invoker (who triggers the action) from the
Receiver (who performs the action).

-> To turn an action into an object that stores method, arguments, and receiver
-> Allow undo/redo, queueing, logging, and parameterization of requests.
-> Decouple the sender from the receiver

Client-> Command -> Invoker -> Receiver

Command: interface with execute() ( and optionally undo())
ConcreteCommand: wraps the receiver and action
Receiver: actual business logic
Invoker: triggers command execution
Client: assembles everything