package generics.demo19;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class GenericArrayWithToken<T> {
    private T[] array;
    @SuppressWarnings("unchecked")
    public GenericArrayWithToken(Class<?> kind, int size){
        array = (T[]) Array.newInstance(kind,size);
    }
    public void put(int index,T item){
        array[index] = item;
    }
    public T[] rep(){
        return array;
    }

    public static void main(String[] args) {
        GenericArrayWithToken<Integer> gai = new GenericArrayWithToken<>(Integer.class,10);
        Integer[] ia = gai.rep();
        for (Integer i : ia) {
            System.out.print(i + " ");
        }


    }
}
