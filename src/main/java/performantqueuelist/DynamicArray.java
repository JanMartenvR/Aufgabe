package performantqueuelist;

public class DynamicArray implements IDynamicArray{

    private int[] array;
    private int size;
    private int start;
    private int end;

    //Konstruktor
    public DynamicArray() {
        this.array = new int[2];
        this.size = 0;
        this.start = 0;
        this.end = 0;
    }

    public int[] getDynamicArray() {
        return array;
    }


    private void resize(int newSize) {
        int[] copy = new int[newSize];
        for(int i = 0; i < size; i++) {
            copy[i] = array[(start + i) % array.length];
        }
        array = copy;
        start = 0;
        end = size;
    }
    private boolean isEmpty() {
        return size == 0;
    }


    @Override
    public int popFront() {
        if (isEmpty()) {
            return -1;
        }
        int i = array[start];
        start = (start + 1) % array.length;
        size--;
        return i;
    }

    @Override
    public int popLast() {
        if (isEmpty()) {
            return -1;
        }
        end = (end - 1 + array.length) % array.length;
        int i = array[end];
        size--;
        return i;
    }

    @Override
    public int pushLast(int i) {
        if (size == array.length) {
            resize(array.length * 2);
        }
        array[end] = i;
        end = (end + 1) % array.length;
        size++;
        return i;
    }

    @Override
    public int pushFront(int i) {
        if (size == array.length) {
            resize(array.length * 2);
        }
        start = (start - 1 + array.length) % array.length;
        array[start] = i;
        size++;
        return i;
    }

    @Override
    public int getValue(int i) {
        if (i < 0 || i >= size) {
            return -1;
        }
        int indexTrans = (start + i) % array.length;
        return array[indexTrans];
    }
}
