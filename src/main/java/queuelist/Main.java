package queuelist;

public class Main {
    public static void main(String[] args) {
        Array array = new Array();

        int i = array.pushFront(1);
        System.out.println(i);
        array.pushLast(4);

        int[] test = array.getArray();
        for (int zahl : test) {
            System.out.print(zahl + " ");
        }

    }
}
