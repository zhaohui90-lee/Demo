package generics.demo10;

import generics.demo5.Generator;

public class Teller {
    private static long count =1;
    private final long id = count++;

    private Teller() {
    }

    @Override
    public String toString() {
        return "Teller{" +
                "id=" + id +
                '}';
    }

    // single generator object
    public static Generator<Teller> generator =
            new Generator<Teller>() {
                @Override
                public Teller next() {
                    return new Teller();
                }
            };
}
