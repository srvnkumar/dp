The visitor pattern in java is one of the most powerful behavior
patterns - especially when you want to add new operations to an existing object structure
with out modifying those classes

Structure
Element - interface with accept(Visitor)
Concrete Elements - implement accept()
Visitor - interface with visit methods
Concrete Visitors - implement operations