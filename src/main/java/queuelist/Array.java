package queuelist;

public class Array implements IQueueList{
    int[] array;

    @Override
    public int popFront() {
        int[]copy = new int[array.length-2];
        for (int i = 0; i < copy.length - 1; i++) {
            copy[i] = array[i+1];
        }
        return array[0];

    }

    @Override
    public int popLast() {
        int[]copy = array;
        return array[array.length-1];

    }

    @Override
    public int pushLast(int i) {
        return 0;
    }

    @Override
    public int pushFront(int i) {
        return 0;
    }

    @Override
    public int get(int i) {
        return 0;
    }
}
