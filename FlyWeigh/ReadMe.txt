The Flyweight pattern is a structural design pattern used to reduce memory usage by
sharing common (instrinsic) state between multiple objects instead of storing it in each object.

Instrinsic state:
Shared immutable data that can be reused across multiple objects. This state is independent of the context in which it is used.

Extrinsic state:
Context-specific data that cannot be shared and must be stored in each object. This state is dependent on the context in which it is used.
diffrent per use(e. table number, tree coordinates, character position).