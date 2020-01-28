package string;

public class Test {
    /**
     * 正则表达式判断
     * @param args
     */
    public static void main(String[] args) {
        for (String pattern : new String[]{"Rudolph",
                "[rR]udolph", "[rR][aeiou][a-z]ol.*","R.*"}) {
            System.out.println("Rudolph".matches(pattern));
        }

        // abc+ 表示匹配ab，后面跟随1个或者多个c
        // (abc)+ 表示匹配多个abc

    }
}
