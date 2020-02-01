package generics.demo6;

import java.util.Iterator;

public class IterableFibonacciModify implements Iterable<Integer>{
    private int n;

    private Fibonacci fibonacci = new Fibonacci();

    public IterableFibonacciModify(int count) {
        this.n = count;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return n > 0;
            }

            @Override
            public Integer next() {
                n--;
                return fibonacci.next();
            }

            public void remove(){
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for (Integer i : new IterableFibonacciModify(20)) {
            System.out.print(i + " ");
        }
    }
}
