package org.example;

import java.util.Set;

public class TerminalExpression implements Expression{
    private final String literal;

    public TerminalExpression(String literal) {
        this.literal = literal;
    }

    @Override
    public boolean interpret(Set<String> context) {
        return context.contains(literal);
    }
}
