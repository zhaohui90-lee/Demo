package generics.demo8;

import generics.demo5.Generator;

public class BaseGenerator<T> implements Generator<T> {
    private Class<T> type;

    public BaseGenerator(Class<T> type) {
        this.type = type;
    }

    @Override
    public T next() {

        try {
            return type.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
    public static <T> Generator<T> create(Class<T> type){
        return new BaseGenerator<>(type);
    }
}
