package stream;

import java.util.*;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("kak dela");
        list.add("ok");
        list.add("poka");

//        for (int i = 0; i < list.size(); i++) {
//            list.set(i, String.valueOf(list.get(i).length()));
//        }
        List<Integer> list1 = list.stream().map(e -> e.length()).collect(Collectors.toList());
        System.out.println(list);
        System.out.println(list1);

        int[] array111 = {5, 9, 3, 8, 5, 6};
        System.out.println(Arrays.toString(array111));
        int [] array2 = Arrays.stream(array111).map(e -> {
            if (e % 3 == 0) {
                e /= 3;
            }
            return e;
        }).toArray();

        System.out.println(Arrays.toString(array2));

        Set<String> set = new TreeSet<>();
        set.add("privet");
        set.add("kak dela");
        set.add("ok");
        set.add("poka");
        System.out.println(set);
        Set<Integer> set2 = set.stream().map(e->e.length()).collect(Collectors.toSet());
        List<Integer> list2 = set.stream().map(e->e.length()).collect(Collectors.toList());
        System.out.println(set2);
        System.out.println(list2);
    }
}
