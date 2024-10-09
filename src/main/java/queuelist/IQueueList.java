package queuelist;

public interface IQueueList {
    int popFront();
    int popLast();
    int pushLast(int i);
    int pushFront(int i);
    int get(int i);
}
