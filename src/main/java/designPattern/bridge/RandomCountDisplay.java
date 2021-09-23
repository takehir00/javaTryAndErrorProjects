package designPattern.bridge;

import java.util.Random;

public class RandomCountDisplay extends CountDisplay {
    public RandomCountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void randomDisplay(int times) {
        Random rnd = new Random();
        int randomCount = rnd.nextInt(times);
        multiDisplay(randomCount);
    }
}
