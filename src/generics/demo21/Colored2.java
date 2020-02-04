package generics.demo21;

import generics.demo20.HasColor;

import java.awt.*;

public class Colored2<T extends HasColor> extends HoldItem<T> {
    Colored2(T item) {
        super(item);
    }
    Color color(){
        return item.getColor();
    }
}
