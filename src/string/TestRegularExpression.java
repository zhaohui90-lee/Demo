package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegularExpression {
    public static void main(String[] args) {
        args = new String[]{"abcbacbacbacb", ""};
        if (args.length < 2){
            System.out.println("Usage:\njava TestRegularExpression " +
                    "characterSquence RegualrExpression");
            System.exit(0);
        }
        System.out.println("input:\"" + args[0] + "\"");
        for (String arg : args) {
            System.out.println("Regular Expression: \"" + arg + "\"");
            Pattern p = Pattern.compile(arg);
            Matcher m = p.matcher(args[0]);
            while (m.find()){
                System.out.println("Match \"" + m.group() + "\" at positions " +
                        m.start() + "-" + (m.end() -1));
            }
        }





    }
}
