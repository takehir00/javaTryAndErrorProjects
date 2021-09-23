package Iterator.Singleton.Q1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        for (int i = 0; i < 10; i++) {
            //10回チケットの番号をゲットする
            System.out.println(
                    TicketMaker.getInstance().getNextTicketNumber());
        }
        Triple tr = Triple.getInstance(0);
        System.out.println("End.");
    }
}
