package org.example;

import java.util.Set;

public interface Expression {
    boolean interpret(Set<String> context);
}
