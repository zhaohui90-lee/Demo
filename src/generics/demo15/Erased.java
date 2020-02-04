package generics.demo15;

import java.util.Objects;

public class Erased<T> {
    private final int SIZE = 100;
    public void f(Object arg){
//        if (arg instanceof T){}
        // Type parameter 'T' cannot be instantiated directly
//        T var = new T();
//        T[] array = new T[SIZE];
        @SuppressWarnings("unchecked")
        T[] array = (T[]) new Object[SIZE];
    }
}
