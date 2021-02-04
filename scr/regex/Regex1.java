package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {
    public static void main(String[] args) {
        String s ="Ivanov vasily, Russia, Moscow, Lenin Street, 51, Flat 48;"+
                "email:vivanov@mail.ru, Postcode:AA99, Phone Number: +123455678" +
                "Petrova Marya, Ukraine,Kiev, Lomonosov street, 33, Flat 18,"+
                "email:masha@gmail.com, Postcode:UKR54,Phone number: +987987987";

        String str = "123    hlhlhlfgldh ljlk j  hl hl hl hl hl hl  lkj  lkj lkjkl jklj ff";

//        Pattern pattern = Pattern.compile("\\w+");
//        Pattern pattern = Pattern.compile("\\b\\d{2}\\b");
//        Pattern pattern = Pattern.compile("\\+\\d{9}");
//        Pattern pattern = Pattern.compile("\\w+@\\w+\\.(ru|com)");
//        Pattern pattern = Pattern.compile("\\w\\s+\\w");
        Pattern pattern = Pattern.compile("(hl){2,3}");


        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
