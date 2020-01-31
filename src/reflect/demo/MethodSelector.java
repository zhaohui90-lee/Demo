package reflect.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MethodSelector implements InvocationHandler {

    private Object proxied;

    public MethodSelector(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        if (method.getName().equals("interesting")){
            System.out.println("Proxy detected the interesting method");
        }
        return method.invoke(proxied,objects);
    }

}
