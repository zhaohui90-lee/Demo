package generics.demo10;

import generics.demo5.Generator;

public class Customer {
    private static long count =1;
    private final long id = count++;
    private Customer(){}

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                '}';
    }

    public static Generator<Customer> generator(){
        return new Generator<Customer>() {
            @Override
            public Customer next() {
                return new Customer();
            }
        };
    }
}
