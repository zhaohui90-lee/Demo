package generics.demo6;

import generics.demo5.Generator;

public class Fibonacci implements Generator<Integer> {
    private int count = 0;
    @Override
    public Integer next() {
        return fib(count++);
    }
    private int fib(int n){
        if (n < 2){
            return 1;
        }
        return fib(n-2) + fib(n -1);
    }

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        // fib(3)+fib(4)
        // fib(1)+fib(2)+fib(2)+fib(3)
        // 1 + 1 + 1 + 1 + 1 + 1 + fib(2)
        // 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1
        // 8
        System.out.println(f.fib(5));;
        for (int i = 0; i < 18; i++) {
            System.out.print(f.next() + " ");
        }
    }
}
