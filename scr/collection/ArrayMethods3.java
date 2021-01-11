package collection;

import java.util.ArrayList;

public class ArrayMethods3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Maria");
        arrayList1.add("Ivan");
        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("!!!");
        arrayList2.add("???");

        // метод addAll
        // добавляет целиком все значения arrayList в arrayList в конец
        arrayList1.addAll(arrayList2);
        System.out.println(arrayList1);

        // метод addAll с укзанием места вставки
        // но можно явно указать место вставки. с какой позиции начинать
        ArrayList <String> arrayList3 = new ArrayList<>();
        arrayList3.add("Значение под индексом 0");
        arrayList3.add("Значение под индексом 1");
        System.out.println(arrayList3);
        arrayList3.addAll(1,arrayList2);
        System.out.println(arrayList3);

        //метод clear
        //очищает arrayList
//        arrayList1.clear();
//        System.out.println(arrayList1);

        //метод indexOf
        //принимает объект и возвращает его индекс или -1 если объект не найден
        int index = arrayList1.indexOf("Ivan");
        int index2 = arrayList1.indexOf("Maxim");
        System.out.println(index);
        System.out.println(index2);

        //метод lastIndexOf
        //принимает объект и возвращает индекс его последнего вхождения
        System.out.println(arrayList1.lastIndexOf("Ivan"));

        //метод size
        //позволяет проверить размер массива
        System.out.println(arrayList1);
        System.out.println("размер arrayList1 " + arrayList1.size());

        //isEmpty
        //проверяет пустой ли arrayList и возвращает boolean
        System.out.println(arrayList1.isEmpty());

        //contains
        //проверят содержит ли arrayList с данным объектом и возвращает boolean
        System.out.println(arrayList1.contains("Maria"));

        //toString
        //выводит данные arrayList в строку. Его обычно не пишут
        System.out.println(arrayList1.toString());
        System.out.println(arrayList1); //тоже самое


    }
}
