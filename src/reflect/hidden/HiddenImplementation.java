package reflect.hidden;

import java.lang.reflect.Method;

public class HiddenImplementation {
    static void callHiddenImplementation(Object a,String methodName) throws Exception{
        Method g = a.getClass().getDeclaredMethod(methodName);
        g.setAccessible(true);
        g.invoke(a);
    }
}
