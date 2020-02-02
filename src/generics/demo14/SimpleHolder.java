package generics.demo14;

public class SimpleHolder {
    private Object obj;
    public void set(Object obj){
        this.obj = obj;
    }
    public Object get(){
        return obj;
    }

    public static void main(String[] args) {
        SimpleHolder simpleHolder = new SimpleHolder();
        simpleHolder.set("item");
        String s = (String) simpleHolder.get();
    }
}
