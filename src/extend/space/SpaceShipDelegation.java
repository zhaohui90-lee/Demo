package extend.space;

public class SpaceShipDelegation {
    private String name;
    private SpaceShipController spaceShipController =
            new SpaceShipController();
    public SpaceShipDelegation(String name){
        this.name = name;
    }

    public void up(int velocity){
        spaceShipController.up(velocity);
    }
    public void down(int velocity){
        spaceShipController.down(velocity);
    }
    public void left(int velocity){
        spaceShipController.left(velocity);
    }
    public void right(int velocity){
        spaceShipController.right(velocity);
    }
    public void forward(int velocity){
        spaceShipController.forward(velocity);
    }
    public void back(int velocity){
        spaceShipController.back(velocity);
    }
    public void turboBoost(int velocity){
        spaceShipController.turboBoost(velocity);
    }

    public static void main(String[] args) {
        SpaceShipDelegation spaceShipDelegation = new SpaceShipDelegation("23132");
        spaceShipDelegation.forward(1000);
    }
}
