package generics.demo1;

public class Holder<T> {
    private T a;
    public Holder(T a){
        this.a = a;
    }
    public void set(T a){
        this.a = a;
    }
    public T get(){
        return a;
    }

    public static void main(String[] args) {
        Holder<Automobile> holder = new Holder<>(new Automobile());
        Automobile a = holder.get();

    }
}
