package generics.demo13;

public class Manipulator2<T extends HasF> {
    private T obj;
    public Manipulator2(T x){
        obj = x;
    }
    public void manipulate(){
        // 给定泛型的边界---<T extends HasF> 就可以编译通过
        obj.f();
    }
}
