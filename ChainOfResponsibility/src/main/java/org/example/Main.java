package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            SupportHandler l1 = new Level1Support();
            SupportHandler l2 = new Level2Support();
            SupportHandler l3 = new Level3Support();
            SupportHandler critical = new CriticalSupport();
            l1.setNext(l2).setNext(l3).setNext(critical);

            SupportTicket t1 = new SupportTicket(SupportTicket.Prority.LOW,"Password Reset");
            SupportTicket t2 = new SupportTicket(SupportTicket.Prority.HIGH, "Database down");
            SupportTicket t3 = new SupportTicket(SupportTicket.Prority.CRITICAL, "Security breach");
            SupportTicket t4 = new SupportTicket(SupportTicket.Prority.MEDIUM, "Instance down");

            l1.handle(t1);
            System.out.println("------------------------------------");
            l1.handle(t2);
            System.out.println("------------------------------------");
            l1.handle(t3);
            System.out.println("------------------------------------");
            l1.handle(t4);
    }
}