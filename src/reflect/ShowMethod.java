package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

public class ShowMethod {
    /**
     * RTTI （Run-Time Type Identification)，通过运行时类型信息程序能够使用基类的指针或引用来检查这些指针或引用所指的对象的实际派生类型。
     *      如果不知道某个对象的确切类型，RTTI可以告诉你；
     *      限制：这个类型在编译期必须已知
     *
     *      Class和java.lang.reflect类库一起对反射的概念进行了支持，改类库包含了Field，Method以及Constructor类（每个类都实现了Member接口）
     *
     *      区别：
     *          对于RTTI，编译器在编译时打开和检查.class文件
     *          对于反射机制，.class文件在编译时是不可获取的，所以是在运行时打开和检查.class文件
     */
    private static String usage =
                    "usage:\n" +
                    "ShowMethods qualified.class.name\n" +
                    "To show all methods in class or:\n" +
                    "ShowMethods qualified.class.name word\n" +
                    "To search for methods involving 'word'";

    /**
     * public static void main(String[])
     * public final native void wait(long) throws InterruptedException
     * public final void wait(long,int) throws InterruptedException
     * public final void wait() throws InterruptedException
     * public boolean equals(Object)
     * public String toString()
     * public native int hashCode()
     * public final native Class getClass()
     * public final native void notify()
     * public final native void notifyAll()
     * public ShowMethod()
     */
    private static Pattern p = Pattern.compile("\\w+\\.");
    /**
     * public static void main(String[])
     * public void wait(long) throws InterruptedException
     * public void wait(long,int) throws InterruptedException
     * public void wait() throws InterruptedException
     * public boolean equals(Object)
     * public String toString()
     * public int hashCode()
     * public Class getClass()
     * public void notify()
     * public void notifyAll()
     * public ShowMethod()
     */
//    private static Pattern p = Pattern.compile("\\w+\\.|[f][i][n][a][l][ ]|[n][a][t][i][v][e][ ]");

    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {
        args = new String[]{"reflect.ShowMethod"};
        if (args.length < 1){
            System.out.println(usage);
            System.exit(0);
        }

        int lines = 0;
        try {
            Class<?> c = Class.forName(args[0]);
            Method[] methods = c.getMethods();
            Constructor[] cons = c.getConstructors();
            if (args.length == 1){
                for (Method method : methods) {
                    System.out.println(p.matcher(method.toString()).replaceAll(""));
                }
                for (Constructor con : cons) {
                    System.out.println(p.matcher(con.toString()).replaceAll(""));
                }
                lines = methods.length + cons.length;
            }else {
                for (Method method : methods) {
                    if (method.toString().contains(args[1])){
                        System.out.println(p.matcher(method.toString()).replaceAll(""));
                        lines++;
                    }

                }
                for (Constructor con : cons) {
                    if (con.toString().contains(args[1])){
                        System.out.println(p.matcher(con.toString()).replaceAll(""));
                        lines++;
                    }

                }
            }
        } catch (ClassNotFoundException e) {
            System.out.println("No such class: "+e);
        }
    }



}
