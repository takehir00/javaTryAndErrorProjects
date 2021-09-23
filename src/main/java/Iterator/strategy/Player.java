package Iterator.strategy;

public class Player {
        private String name;
        private Strategy strategy;
        private int wincount;
        private int losecount;
        private int gamecount;
        public Player(String name, Strategy strategy) {         // Ì¾Á°¤ÈÀïÎ¬¤ò¼ø¤±¤é¤ì¤ë
            this.name = name;
            this.strategy = strategy;
        }
        public Hand nextHand() {                                // ÀïÎ¬¤Ë¤ª¤¦¤«¤¬¤¤¤òÎ©¤Æ¤ë
            return strategy.nextHand();
        }
        public void win() {                 // ¾¡¤Ã¤¿
            strategy.study(true);
            wincount++;
            gamecount++;
        }
        public void lose() {                // Éé¤±¤¿
            strategy.study(false);
            losecount++;
            gamecount++;
        }
        public void even() {                // °ú¤­Ê¬¤±
            gamecount++;
        }
        public String toString() {
            return "[" + name + ":" + gamecount + " games, " + wincount + " win, " + losecount + " lose" + "]";
        }

}
