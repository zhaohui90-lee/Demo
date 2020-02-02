package generics.demo13;

public class Manipulation {
    public static void main(String[] args) {
        HasF hf = new HasF();
        Manipulator<HasF> manipulator =
                new Manipulator<>(hf);
        manipulator.manipulator();
    }
}
