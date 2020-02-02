package generics.demo11;

import generics.demo8.Generators;

import java.util.ArrayList;
import java.util.List;

public class Shelf extends ArrayList<Product> {
//    List<Product> list = new ArrayList<>();
    public Shelf(int nProduct){
        Generators.fill(this,Product.generator,nProduct);
    }
}
