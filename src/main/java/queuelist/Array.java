package queuelist;

public class Array implements IQueueList {
    private int[] array;
    private int size;

    //Konstruktor
    public Array() {
        this.array = new int[2];
        this.size = 0;
    }

    public int[] getArray() {
        return array;
    }


    private void resize(int newSize) {
        int[] copy = new int[newSize];
        System.arraycopy(array, 0, copy, 0, size);
        array = copy;
    }
    private boolean isEmpty() {
        return size == 0;
    }


    @Override
    public int popFront() {
        if (isEmpty()) {
            return -1;
        }
        int i = array[0];
        for (int j = 0; j < size - 1; j++) {
            array[j] = array[j + 1];
        }
        size--;
        return i;
    }

    @Override
    public int popLast() {
        if (isEmpty()) {
            return -1;
        }
        int i = array[size - 1];
        size--;
        return i;
    }

    @Override
    public int pushLast(int i) {
        if (size == array.length) {
            resize(array.length * 2);
        }
        array[size] = i;
        size++;
        return i;
    }

    @Override
    public int pushFront(int i) {
        if (size == array.length) {
            resize(array.length * 2);
        }
        for (int j = size; j > 0; j--) {
            array[i] = array[i - 1];
        }
        array[0] = i;
        size++;
        return i;
    }

    @Override
    public int get(int i) {
        if (i < 0 || i >= size) {
            return -1;
        }
        return array[i];
    }
}
