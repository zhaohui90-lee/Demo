package generics.demo21;

public class HoldItem<T> {
    T item;
    HoldItem(T item){
        this.item = item;
    }
    T getItem(){
        return item;
    }
}
