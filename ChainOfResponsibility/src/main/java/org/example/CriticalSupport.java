package org.example;

public class CriticalSupport extends SupportHandler{
    @Override
    public boolean canHandle(SupportTicket ticket) {
        return ticket.getPrority()== SupportTicket.Prority.CRITICAL;
    }

    @Override
    public void process(SupportTicket ticket) {
        System.out.println("Critical ticket handled:"+ticket.getMessage());
    }
}
