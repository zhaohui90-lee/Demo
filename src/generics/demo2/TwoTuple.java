package generics.demo2;

public class TwoTuple<A,B> {
    public final A first;
    public final B second;

    public TwoTuple(A first, B second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "TwoTuple{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    public static void main(String[] args) {
        TwoTuple<String,String> twoTuple = new TwoTuple<>("aaa","bbb");
        System.out.println(twoTuple.first);
        System.out.println(twoTuple.second);


    }
}
