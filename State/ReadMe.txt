The State Pattern replaces complex if/else or switch logic with
state-specific classes. When the state changes, the object's behavior changes automatically.

Structure
- State(interface) - defines behavior
- Concrete States - implement behavior for each state
- Context - holds current state and delegates behavior
