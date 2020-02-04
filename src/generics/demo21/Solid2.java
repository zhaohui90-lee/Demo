package generics.demo21;

import generics.demo20.Dimension;
import generics.demo20.HasColor;
import generics.demo20.Weight;

public class Solid2<T extends Dimension & HasColor & Weight> extends ColoredDimension2<T> {
    Solid2(T item) {
        super(item);
    }
    int weight(){
        return item.weight();
    }
}
