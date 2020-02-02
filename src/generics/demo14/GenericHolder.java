package generics.demo14;

public class GenericHolder<T> {
    private T obj;
    public void set(T obj){
        this.obj = obj;
    }
    public T get(){
        return obj;
    }

    public static void main(String[] args) {
        GenericHolder<String> genericHolder = new GenericHolder<>();
        genericHolder.set("item");
        String s = genericHolder.get();
    }
}
