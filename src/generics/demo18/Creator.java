package generics.demo18;

public class Creator extends GenericWithCreate<X> {
    @Override
    X create() {
        return new X();
    }
    void f(){
        System.out.println(element.getClass().getSimpleName());
    }
}
