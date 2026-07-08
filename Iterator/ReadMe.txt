The Iterator pattern provides a uniform way to traverse elements of a collection without exposing its internal structure.

Instead of :
- exposing arrays
- expsign lists
- exposing internal nodes
... the colleciton gives you an iterator object that knows how to move through elements.

why Iterator Pattern exists:
- It solves three major problems
1. Encapsulation - The client should not know how the collection stores data.
2. Uniform traversal - Differet collections -> same traversal API.
3. Multiple traversal strategies - Forward, backward, filtered, custom traversal.

Iterator PAttern structure (GOF)

Iteratable (Aggregate)
    |
ConcreteAggrgate (e.g. My collection)
    |
Iterator
    |
ConcreteIterator


















Iterable (


