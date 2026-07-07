package org.example;

public class SupportTicket {
    public enum Prority { LOW, MEDIUM,  HIGH, CRITICAL }

    private final Prority prority;

    private final String message;

    public SupportTicket(Prority prority, String message) {
        this.prority = prority;
        this.message = message;
    }

    public Prority getPrority() {
        return prority;
    }

    public String getMessage() {
        return message;
    }
}
