package performantqueuelist;

public interface IDynamicArray {
    int popFront();
    int popLast();
    int pushLast(int i);
    int pushFront(int i);
    int getValue(int i);
}
