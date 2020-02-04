package generics.demo22;

import java.util.ArrayList;
import java.util.List;

public class GenericsAndCovariance {
    public static void main(String[] args) {
        List<? extends Fruit> fruits = new ArrayList<Apple>();
//        fruits.add(new Apple()); // compile error
//        fruits.add(new Fruit()); // compile error
//        fruits.add(new Object());// compile error
        fruits.add(null);
        Fruit f = fruits.get(0);

        System.out.println(getFruit());
    }

    public static List<? extends Fruit> getFruit(){
        List<Apple> list = new ArrayList<>();
        list.add(new Apple());
        return list;
    }
}
