package generics.demo15;

import java.util.HashMap;
import java.util.Map;

public class ClassTypeCapture<T> {
    Class<T> kind;


    public ClassTypeCapture(Class<T> kind) {
        this.kind = kind;
    }

    public boolean f(Object arg){
        return kind.isInstance(arg);
    }


    public static void main(String[] args) {
        ClassTypeCapture<String> ctt1 = new ClassTypeCapture<>(String.class);
        System.out.println(ctt1.f(new StringBuilder()));// false
        System.out.println(ctt1.f(new Object()));// false
    }
}
