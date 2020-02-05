package generics.demo23;

import generics.demo22.Apple;
import generics.demo22.Fruit;

public class Holder<T> {
    private T value;
    public Holder(){}
    public Holder(T val){
        value = val;
    }
    public T get(){
        return value;
    }
    public void set(T val){
        value = val;
    }
    public boolean equal(Object obj){
        return value.equals(obj);
    }

    public static void main(String[] args) {
        Holder<Apple> appleHolder = new Holder<>(new Apple());
        Apple d = appleHolder.get();
        appleHolder.set(d);
//        Holder<Fruit> fruitHolder = appleHolder; // cannot cast
        Holder<? extends Fruit> fruit = appleHolder;
        Fruit f = fruit.get();
        d = (Apple) fruit.get(); // return Object
        try {
            Orange o = (Orange) fruit.get();
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println(fruit.value+":"+fruit.equal(d));
    }
}
