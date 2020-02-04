package generics.demo21;

import generics.demo20.Bounded;

public class InheritBounds {
    public static void main(String[] args) {
        Solid2<Bounded> solid2 = new Solid2<>(new Bounded());
        solid2.color();
        solid2.weight();
        solid2.getX();
    }
}
