package interfaces.factory.game;

public class Games {

    public static void playGame(GameFactory factory){
        Game g = factory.getGame();
        System.out.println(g.getRandomPoint());
    }

    public static void main(String[] args) {
        playGame(new CoinFactoryImp());
        playGame(new DiceFactoryImp());
    }
}
