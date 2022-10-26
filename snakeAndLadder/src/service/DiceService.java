package service;

import java.util.concurrent.ThreadLocalRandom;

public class DiceService {
    public int rollDice()
    {
        return ThreadLocalRandom.current().nextInt(1, 6 + 1);
    }
}
