package extend.upcast;

public class Frog extends Amphibian {

    private final int j;
    
    Frog(){
        j = 1;
    }

    public void live(){
        System.out.println("Frog can live in water and land...");
    }

    public static void main(String[] args) {
        Amphibian amphibian = new Frog();
        amphibian.live();
    }
}
