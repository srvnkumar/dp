The Observer Pattern lets one object (Subject) automatically notify a list of dependent objects(observers)
 whenever its state changes.

 Its perfect for even-driven systems, UI frameworks, messaging and distributed systems.

 Use It
 -> you want loose coupling between publisher and subscribers
 -> you want to notify multiple objects about a state change

 Structure:
  - Maintain a list of observers
  - Provides attach(), detach(), notifyObservers()

  Observer
  - Defines update() method

  ConcreteSubject
  - Holds actual state

  Concrete Observer
  - Reacts to updates

