package generics.demo7;

import reflect.demo2.Person;
import reflect.demo2.Position;

import java.util.List;
import java.util.Map;

public class LimitOfInference {
    static void f(Map<Person, List<? extends Position>> staff){

    }

    public static void main(String[] args) {
        // in SE5 cannot compile ,in SE11 can compile
        f(New.map());
    }
}
