package org.example;

public class Level2Support extends SupportHandler{
    @Override
    public boolean canHandle(SupportTicket ticket) {
        return ticket.getPrority() == SupportTicket.Prority.MEDIUM;
    }

    @Override
    public void process(SupportTicket ticket) {
        System.out.println("Level2 handled the ticket:"+ ticket.getMessage());
    }
}
