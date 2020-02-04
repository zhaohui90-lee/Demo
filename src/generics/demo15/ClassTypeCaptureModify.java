package generics.demo15;

import java.util.HashMap;
import java.util.Map;

public class ClassTypeCaptureModify {
    Map<String,Class<?>> types = new HashMap<>();

    public void addType(String typename,Class<?> kind){
        types.put(typename,kind);
    }

    public Object createNew(String typename){
        Class<?> cl = types.get(typename);
        try {
            return cl.getDeclaredConstructor().newInstance();
        } catch (NullPointerException e) {
            System.out.println("Not a registered typename: " + typename);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return null;
    }

    public static void main(String[] args) {
        ClassTypeCaptureModify ctcm = new ClassTypeCaptureModify();
        ctcm.addType("String",String.class);
        System.out.println(ctcm.createNew("String").getClass());
    }
}
