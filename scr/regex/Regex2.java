package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {
//        String s1 = "ABCD ABCE ABCFABCGABCH";
//        String s1 = "LHNAJBGBFCFD";
//        String s1 = "ABDOP";
//        String s1 = "abcd abce abc5abcg6abch";
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc(d|5)");
//        Pattern pattern1 = Pattern.compile("abc.");
//        Pattern pattern1 = Pattern.compile("^abc");
//        Pattern pattern1 = Pattern.compile("abc5abcg6abch$");
//        Pattern pattern1 = Pattern.compile("[0-9]");
//        Pattern pattern1 = Pattern.compile("\\d");
//        Pattern pattern1 = Pattern.compile("\\D");
//        Pattern pattern1 = Pattern.compile("\\w"); // [A-Za-z0-9_]
//        Pattern pattern1 = Pattern.compile("\\w+"); // [A-Za-z0-9_]

        String s1 = "privet poka ok dlinnomerka";
        Pattern pattern1 = Pattern.compile("\\w{4}");





        Matcher matcher = pattern1.matcher(s1);

        while (matcher.find()){
            System.out.println("possition " + matcher.start() + "  "  + matcher.group());
        }
    }
}
