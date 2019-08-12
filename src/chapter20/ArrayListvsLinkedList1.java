package chapter20;

import java.util.*;

public class ArrayListvsLinkedList1 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        test(list1, "Time for ArrayList is ");
        testLinkedList(list2, "Time for LinkedList is ");
    }

    public static void test(List<Integer> list, String title) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            list.add(0, i);
        }

        long time = System.currentTimeMillis() - startTime;
        System.out.println(title + time + " milliseconds");
    }

    public static void testLinkedList(LinkedList<Integer> list, String title) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            list.addLast(i);
        }

        long time = System.currentTimeMillis() - startTime;
        System.out.println(title + time + " milliseconds");
    }
}