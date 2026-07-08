The Memento pattern captures an object's internal state and allows restoring it later without exposing its internals.

In involves three roles:

1. Originator

The object whose state you want to save/restore.

2. Memento

A snapshot of the originator's state.

3. Caretaker

Stores momentos and manages undo/redo

Use it when you need:
- undo/redo
- Rollback
- versioning
- Snapshots
- State history
- Non-invasive state saving( no getters exposing internals)

Originator
    |
creates/restores
    |
 Momento
    |
 stored by
    |
 Caretaker

