package org.example;

public interface Visitor {
    void visit(Book book);
    void visit(Fruit fruit);
}
