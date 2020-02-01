package generics.demo7;

public class GenericMethodModify {
    public <A,B,C> void f(A a,B b,C c){
        System.out.println(a.getClass().getName() + ";" +
                b.getClass().getName() + ";" +
                c.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethodModify gen = new GenericMethodModify();
        gen.f("",1,1.0F);
        gen.f('a',"s",1.9D);
    }
}
