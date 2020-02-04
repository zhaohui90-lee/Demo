package generics.demo17;

public class IntegerFactory implements FactoryI<Integer> {
    @Override
    public Integer create() {
        return Integer.valueOf(0);
    }
}
