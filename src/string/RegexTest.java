package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
    public static void main(String[] args) {
//        String s = "Java now has regular expressions";
//        System.out.println(s);
//        Matcher m  = Pattern.compile("s{0,3}").matcher(s);
//        while (m.find()){
//            System.out.print(m.group()+" ");
//        }
//        Pattern p = Pattern.compile(s);
//        p.matcher("a");
//        System.out.println(s.matches("^Java.*"));
//        System.out.println(s.matches("\\Breg.*"));
//        System.out.println(s.matches("[A-Za-z]+$"));

        String pattern = "(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b";
        String ss = "Arline ate eight apples and one orange while Anita hadn't any";
        Matcher matcher  = Pattern.compile(pattern).matcher(ss);
        while (matcher.find()){
            System.out.print(matcher.group()+" ");
        }
    }
}
