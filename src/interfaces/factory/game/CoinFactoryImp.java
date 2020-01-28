package interfaces.factory.game;

public class CoinFactoryImp implements GameFactory {
    @Override
    public Game getGame() {
        return new G_Coin();
    }
}
