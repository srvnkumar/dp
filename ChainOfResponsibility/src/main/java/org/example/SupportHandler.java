package org.example;

public abstract class SupportHandler {
    private SupportHandler next;

    public SupportHandler setNext(SupportHandler next) {
        this.next = next;
        return this.next;
    }

    public final void handle(SupportTicket ticket){
        if(canHandle(ticket)){
            process(ticket);
        }else if(next !=null){
            System.out.println(getClass().getSimpleName() + " passing");
            next.handle(ticket);
        } else{
            System.out.println("No handler for"+ ticket.getMessage());
        }
    }

    public abstract boolean canHandle(SupportTicket ticket);
    public abstract void process(SupportTicket ticket);

}
