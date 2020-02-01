package generics.demo7;

public class GenericMethod {
    public <T> void f(T x){
        System.out.println(x.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethod gen = new GenericMethod();
        gen.f("");
        gen.f(1);
        gen.f(1.0F);
        gen.f(1.9D);
        gen.f('x');
        gen.f(gen);
    }
}
