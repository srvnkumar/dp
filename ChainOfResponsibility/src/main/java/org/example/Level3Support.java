package org.example;

public class Level3Support extends SupportHandler{
    @Override
    public boolean canHandle(SupportTicket ticket) {
        return ticket.getPrority()== SupportTicket.Prority.HIGH;
    }

    @Override
    public void process(SupportTicket ticket) {
        System.out.println("Level3 Support ticket handled:"+ ticket.getMessage());
    }
}
