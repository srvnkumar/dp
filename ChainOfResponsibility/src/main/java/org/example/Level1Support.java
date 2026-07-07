package org.example;

public class Level1Support extends SupportHandler{
    @Override
    public boolean canHandle(SupportTicket ticket) {
        return ticket.getPrority()==SupportTicket.Prority.LOW;
    }

    @Override
    public void process(SupportTicket ticket) {
        System.out.println("Level1Support ticket handled:"+ticket.getMessage());
    }
}
