package interfaces.factory.game;

import java.util.Random;

public class G_Dice implements Game {
    @Override
    public String getRandomPoint() {
        Random rand = new Random();
        int point = rand.nextInt(7) + 1;
        return "G_Dice point is " + point;
    }
}
