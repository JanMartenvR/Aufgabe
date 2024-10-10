package performantqueuelist;

import queuelist.Array;

public class Main {
    public static void main(String[] args) {
        DynamicArray array = new DynamicArray();

        int i = array.pushFront(1);
        System.out.println(i);
        array.pushLast(4);

        int[] test = array.getDynamicArray();
        for (int zahl : test) {
            System.out.print(zahl + " ");
        }
    }
}
