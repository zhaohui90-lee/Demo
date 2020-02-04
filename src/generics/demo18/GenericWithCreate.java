package generics.demo18;

abstract class GenericWithCreate<T> {
    final T element;
    GenericWithCreate(){
        element = create();
    }
    abstract T create();
}
