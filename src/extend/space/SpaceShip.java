package extend.space;

public class SpaceShip extends SpaceShipController{
    private String name;
    public SpaceShip(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "SpaceShip{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        SpaceShip spaceShip = new SpaceShip("1231321");
        spaceShip.forward(100);
    }
}
