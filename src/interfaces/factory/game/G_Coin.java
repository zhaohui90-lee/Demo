package interfaces.factory.game;

import java.util.Random;

public class G_Coin implements Game {
    @Override
    public String getRandomPoint() {
        Random rand = new Random();
        int point = rand.nextInt(2);
        return "G_Coin point is " + point;
    }
}
