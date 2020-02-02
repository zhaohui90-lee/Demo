package generics.demo13;

public class Manipulator<T> {
    private T obj;

    public Manipulator(T obj) {
        this.obj = obj;
    }

    public void manipulator(){
        // compile error
//        obj.f();
    }
}
