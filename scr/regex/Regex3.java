package regex;

public class Regex3 {
    public static void main(String[] args) {
        String s ="Ivanov vasily, Russia, Moscow, Lenin Street, 51, Flat 48;"+
                "email:vivanov@mail.ru, Postcode:AA99, Phone Number: +123455678" +
                "Petrova Marya, Ukraine,Kiev, Lomonosov street, 33, Flat 18,"+
                "email:masha@gmail.com, Postcode:UKR54,Phone number: +987987987";
        String s2 = "vivanov@mail.ru";
        boolean result = s2.matches("\\w+@\\w+\\.(com|ru)");
        System.out.println(result);
    }
}
