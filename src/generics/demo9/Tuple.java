package generics.demo9;

import generics.demo2.ThreeTuple;
import generics.demo2.TwoTuple;

public class Tuple {
    public static <A,B>TwoTuple<A,B> tuple(A a,B b){
        return new TwoTuple<>(a,b);
    }
    public static <A,B,C> ThreeTuple<A,B,C> tuple(A a, B b, C c){
        return new ThreeTuple<>(a,b,c);
    }

}
