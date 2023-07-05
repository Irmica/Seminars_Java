package Seminar_Java4;

import java.util.ArrayList;
import java.util.LinkedList;

// 1) Замерьте время, за которое в ArrayList добавятся 1000000 элементов.
// 2) Замерьте время, за которое в LinkedList добавятся 1000000 элементов. Сравните с предыдущим.
public class Task1 {

    public static void main(String[] args) {
        timeComparimg();
    }

    static void timeComparimg() {
        ArrayList<Integer> al = new ArrayList<>();
        LinkedList<Integer> ll = new LinkedList<>();

        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 10000010; i++) {
            al.add(5);
        }
        System.out.println(System.currentTimeMillis() - start1);
        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 10000010; i++) {
            ll.add(5);
        }
        System.out.println(System.currentTimeMillis() - start2);

    }
}