package generics.demo11;

import generics.demo5.Generator;

import java.util.Random;

public class Product {
    private final int id;
    private String description;
    private double price;

    public Product(int id, String description, double price) {
        this.id = id;
        this.description = description;
        this.price = price;
    }
    public String toString(){
        return id + ": " + description + ", price:$ " + price;
    }
    public void priceChange(double change){
        price += change;
    }
    public static Generator<Product> generator =
            new Generator<Product>() {
            private Random rand = new Random(47);
                @Override
                public Product next() {
                    return new Product(rand.nextInt(1000),"Test",
                            Math.round(rand.nextDouble()*1000.0)+0.99);
                }
            };
}
