package generics.demo5;

import java.util.Iterator;
import java.util.Random;

public class CoffeeGenerator implements Generator<Coffee>,Iterable<Coffee> {
    @SuppressWarnings("rawtypes")
    private Class[] type = {Latte.class,Breve.class,Americano.class,Cappuccino.class};
    private Random rand = new Random(47);

    public CoffeeGenerator() {
    }

    // for iterator
    private int size = 0;

    public CoffeeGenerator(int size) {
        this.size = size;
    }

    @SuppressWarnings("unchecked")
    @Override
    public Coffee next() {
        try {
            return (Coffee) type[rand.nextInt(type.length)].getDeclaredConstructor().newInstance();
        } catch (Exception e){
            throw new RuntimeException();
        }
    }

    @Override
    public Iterator<Coffee> iterator() {
        return new Iterator<Coffee>() {
            int count = size;

            @Override
            public boolean hasNext() {
                return count > 0;
            }

            @Override
            public Coffee next() {
                count--;
                return CoffeeGenerator.this.next();
            }
            public void remove(){
                throw new UnsupportedOperationException();
            }
        };
    }

//    class CoffeeIterator implements Iterator<Coffee>{
//        int count = size;
//
//        @Override
//        public boolean hasNext() {
//            return count > 0;
//        }
//
//        @Override
//        public Coffee next() {
//            count--;
//            return CoffeeGenerator.this.next();
//        }
//        public void remove(){
//            throw new UnsupportedOperationException();
//        }
//    }

    public static void main(String[] args) {
        CoffeeGenerator cg = new CoffeeGenerator();
        for (int i = 0; i < 5; i++) {
            System.out.println(cg.next());
        }
        for (Coffee coffee : new CoffeeGenerator(5)) {
            System.out.println(coffee);
        }
    }
}
