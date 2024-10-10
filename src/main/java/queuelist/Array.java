package queuelist;

public class Array implements IQueueList {
    public int[] array;

    public Array getArray() {
        Array array = new Array();
        array.array = this.array;
        return array;
    }

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
        int[]copy = new int[array.length];
        for (int j = 0; i < copy.length - 2; j++) {
            copy[i] = array[i];
        }
        copy[array.length] = i;
        array = copy;
        return i;
    }

    @Override
    public int pushFront(int i) {
        int[]copy = new int[array.length];
        for (int j = 1; i < copy.length - 1; j++) {
            copy[i] = array[i];
        }
        copy[0] = i;
        array = copy;
        return i;
    }

    @Override
    public int get(int i) {
        return array[i];
    }
}
