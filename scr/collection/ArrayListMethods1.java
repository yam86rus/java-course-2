package collection;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Maria");
        System.out.println(arrayList1);

        // метод add
        // Можно добавить новый элемент на определенный индекс, остальные сдвинуться вправо
        arrayList1.add(1, "Misha");
        System.out.println(arrayList1);

        // Нельзя создавать ArrayList  с примитивными типами данных
        // Можно использовать только reference datatype
        ArrayList<Integer> arrayList2 = new ArrayList<>(); // используем wrapper
        arrayList2.add(3);
        arrayList2.add(1);
        arrayList2.add(3);
        arrayList2.add(3);
        System.out.println(arrayList2);

        // метод get
        // метод get возвращает элемент на определенной позиции
        System.out.println(arrayList1.get(2));

        // метод set
        // метод  set вставляет элемент в ArrayList  на определенный индекс
        // можно рассматривать как replace. Он заменит элемент на этом индексе
        // на тот, который указан во втором методе

        arrayList2.set(1, 666);
        System.out.println(arrayList2);

        // метод remove
        // удалет или по индексу, или сам элемент по названию

        arrayList2.remove(1); // удаляем элемент под индексом 1
        System.out.println(arrayList2);


    }
}
