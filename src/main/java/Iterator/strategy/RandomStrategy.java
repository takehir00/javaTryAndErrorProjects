package Iterator.strategy;

import java.util.Random;

public class RandomStrategy extends Strategy {
    private Random random;
    private boolean won = false;


    @Override
    public Hand nextHand() {
        return Hand.getHand(random.nextInt(3));
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
