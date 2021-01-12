package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test5 {
    public static void main(String[] args) {
        int[] array = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18};

        // 2-й вариант
        array = Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(array));

        // 1-й вариант
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        List<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(8);
        list1.add(1);
        list1.add(5);
        list1.add(9);
        list1.add(12);
        list1.add(4);
        list1.add(21);
        list1.add(81);
        list1.add(7);
        System.out.println();
        System.out.println(list1);
        list1 = list1.stream().sorted().collect(Collectors.toList());
        System.out.println(list1);

        int[] array2 = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18};
        int result2 = Arrays.stream(array2).
                filter(e -> e % 2 == 1)
                .
                map(e -> {
                    if (e % 3 == 0) {
                        e /= 3;
                    }
                    return e;
                })
                .reduce((a, e) -> a + e).getAsInt();
        System.out.println(result2);

    }
}
