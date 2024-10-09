package queuelist;

public class Array implements IQueueList {
    int[] array;

    @Override
    public int popFront() {
        int tmp = array[0];
        int[] copy = new int[array.length - 2];
        for (int i = 0; i < copy.length - 1; i++) {
            copy[i] = array[i + 1];
        }
        array = copy;
        return tmp;

    }

    @Override
    public int popLast() {
        int tmp = array[array.length - 1];
        int[] copy = new int[array.length - 2];
        for (int i = 0; i < copy.length - 2; i++) {
            copy[i] = array[i];
        }
        array = copy;
        return tmp;
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
