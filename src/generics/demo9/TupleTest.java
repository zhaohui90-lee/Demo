package generics.demo9;

import generics.demo2.TwoTuple;

public class TupleTest {
    static TwoTuple<String,Integer> f(){
        return Tuple.tuple("j1",232);
    }
    static TwoTuple f2(){
        return Tuple.tuple("ad",15);
    }
    public static void main(String[] args) {
        System.out.println(f());
        System.out.println(f2());
    }
}
