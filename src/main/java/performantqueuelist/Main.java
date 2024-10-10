package performantqueuelist;


public class Main {
    public static void main(String[] args) {
        DynamicArray array = new DynamicArray();

        int i = array.pushFront(1);
        System.out.println(i);
        array.pushLast(4);


        System.out.println(array.getValue(2));

        int[] test = array.getDynamicArray();
        for (int zahl : test) {
            System.out.print(zahl + " ");
        }
    }
}
