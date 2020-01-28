package interfaces.factory.game;

public class DiceFactoryImp implements GameFactory {
    @Override
    public Game getGame() {
        return new G_Dice();
    }
}
