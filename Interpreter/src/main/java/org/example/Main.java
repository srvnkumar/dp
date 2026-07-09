package org.example;

import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Set<String> userContext = Set.of("admin", "active");

        Expression rule1 = new AndExpression(new TerminalExpression("admin"),
                                                new TerminalExpression("active"));

        Expression rule2 = new OrExpression(new TerminalExpression("premium"),
                new TerminalExpression("trial"));
        System.out.println("Rule1: "+ rule1.interpret(userContext));
        System.out.println("Rule2: "+ rule2.interpret(userContext));
    }
}