package generics.demo3;

public class LinkedStackModify<T> {
    private class Node{
        T item;
        Node next;
        Node(){
            item = null;
            next = null;
        }
        Node(T item,Node next){
            this.item = item;
            this.next = next;
        }
        boolean end(){
            return item == null && next == null;
        }
    }
    private Node top = new Node();// end sentinel
    public void push(T item){
        top = new Node(item,top);
    }
    public T pop(){
        T result = top.item;
        if (!top.end()){
            top = top.next;
        }
        return result;
    }

    public static void main(String[] args) {
        LinkedStack<String> lss = new LinkedStack<>();
        for (String s : "sds sdoq qrw".split(" ")) {
            lss.push(s);
        }
        String s;
        while ((s = lss.pop())!=null){
            System.out.println(s);
        }

    }
}
