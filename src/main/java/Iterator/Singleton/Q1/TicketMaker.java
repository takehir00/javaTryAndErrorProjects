package Iterator.Singleton.Q1;

public class TicketMaker {
    private static int ticket = 1000;
    private static final TicketMaker ticketMaker = new TicketMaker();
    private TicketMaker() {
        System.out.println("インスタンスを生成しました");
    }
    public static TicketMaker getInstance() { return ticketMaker; }
    public synchronized int getNextTicketNumber() {
        return ticket++;
    }
}
