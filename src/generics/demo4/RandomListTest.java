package generics.demo4;

public class RandomListTest {
    public static void dump(RandomList<?> rl){
        for (int i = 0; i < 11; i++) {
            System.out.print(rl.select() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        RandomList<String> rs = new RandomList<>();
        for (String s : "nsd sdj qoe we ewwe q 3".split(" ")) {
            rs.add(s);
        }
        dump(rs);
    }
}
