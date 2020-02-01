package generics.demo7;

import generics.demo2.TwoTuple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class New {
    public static <K,V> Map<K,V> map(){
        return new HashMap<>();
    }
    public static <T> List<T> list(){
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        List<TwoTuple<String,String>> list = New.list();
        list.add(new TwoTuple<>("s","a"));
        System.out.println(list);
    }
}
