package stream;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        String[] names = {"Максим", "Сергей", "Николай"};
        char[] ch = {'a', 'b', 'c', 'd', 'e', 'f'};
        double[] dou = {2.34, 4, 32, 6.765, 9.4356};

        Arrays.stream(array).forEach(e -> {
            e *= 2;
            System.out.print(e + " ");
        });
        System.out.println();

        Arrays.stream(array).forEach(e -> System.out.print(e + " "));
        Arrays.stream(array).forEach(System.out::println);
        System.out.println();
        Arrays.stream(array).forEach(Utils::myMethod);
        System.out.println();
        Arrays.stream(names).forEach(e -> Utils.showNames(e));
        System.out.println();
        Arrays.stream(dou).forEach(System.out::println);

    }
}

class Utils {
    public static void myMethod(int a) {
        a += 5;
        System.out.println("Element = " + a);
    }

    public static void showNames(String s) {
        System.out.println("Name = " + s);
    }
}
