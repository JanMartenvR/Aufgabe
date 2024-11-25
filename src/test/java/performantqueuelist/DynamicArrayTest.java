package performantqueuelist;

import org.junit.Test;

import static org.junit.Assert.*;


public class DynamicArrayTest {

    @Test
    public void popFront() {
        DynamicArray array = new DynamicArray();
        assertEquals("check error handling", -1, array.popFront());
        array.pushFront(1);
        array.pushFront(2);
        array.pushFront(3);
        assertEquals(3, array.popFront());
        assertEquals(2, array.popFront());
        assertEquals(1, array.popFront());
        assertEquals(-1, array.popFront());
    }

    @Test
    public void popLast() {
        DynamicArray array = new DynamicArray();
        assertEquals("check error handling", -1, array.popLast());
        array.pushFront(1);
        array.pushFront(2);
        array.pushFront(3);
        assertEquals(1, array.popLast());
        assertEquals(2, array.popLast());
        assertEquals(3, array.popLast());
        assertEquals(-1, array.popLast());
    }

    @Test
    public void pushLast() {

    }

    @Test
    public void pushFront() {
    }

    @Test
    public void getValue() {
    }
}