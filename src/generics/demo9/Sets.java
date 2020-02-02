package generics.demo9;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static <T>Set<T> union(Set<T> a,Set<T> b ){
        Set<T> result = new HashSet<>(a);
        result.addAll(b);
        return result;
    }
    public static <T>Set<T> intersection(Set<T> a,Set<T> b){
        Set<T> result = new HashSet<>(a);
        // 获取a与b的交集
        result.retainAll(b);
        return result;
    }
    public static <T>Set<T> different(Set<T> a,Set<T> b){
        Set<T> result = new HashSet<>(a);
        result.removeAll(b);
        return result;
    }
}
