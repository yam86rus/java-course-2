package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Maria");
//        arrayList1.add(50); // не String
        System.out.println(arrayList1);
        //Создаем ArrayList вместимостью 300; по умолчанию вместимость 10;
        ArrayList<String> arrayList2 = new ArrayList<>(200);
        arrayList2.add("Zaur");
        arrayList2.add("Ivan");

        // List интерфейс, который имплементирует ArrayList
        List<String> arrayList3 = new ArrayList<>(200);

        ArrayList<String> arrayList4 = new ArrayList<>(arrayList1);
        System.out.println("ArrayList 4 \n" + arrayList4);
        System.out.println(arrayList1 == arrayList4);


    }
}
