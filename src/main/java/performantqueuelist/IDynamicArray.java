package performantqueuelist;

public interface IDynamicArray {
    /**
     * Deletes the first entry of the array and returns the deleted number. If not possible it will return -1
     * @return
     */
    int popFront();

    /**
     * Deletes the last entry of the array and returns the deleted number. If not possible it will return -1
     * @return
     */
    int popLast();

    /**
     * Adds the integer i to the end of the array and returns the added number
     * @param i
     * @return
     */
    int pushLast(int i);

    /**
     * Adds the integer i to the front of the array and returns the added number
     * @param i
     * @return
     */
    int pushFront(int i);

    /**
     * returns the number in the array on the position i if it exists. Otherwise it will return -1
     * @param i
     * @return
     */
    int getValue(int i);
}
