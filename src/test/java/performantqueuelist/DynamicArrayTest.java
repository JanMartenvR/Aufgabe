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
        DynamicArray array = new DynamicArray();
        array.pushLast(1);
        assertEquals(1, array.getValue(0));
        array.pushLast(2);
        assertEquals(1, array.getValue(0));
        assertEquals(2, array.getValue(1));
        array.pushLast(3);
        array.pushLast(4);
        array.pushLast(5);
        array.pushLast(6);
        array.pushLast(7);
        assertEquals(3, array.getValue(2));
        assertEquals(4, array.getValue(3));
        assertEquals(5, array.getValue(4));
        assertEquals(6, array.getValue(5));
        assertEquals(7, array.getValue(6));

    }

    @Test
    public void pushFront() {
        DynamicArray array = new DynamicArray();
        array.pushFront(1);
        assertEquals(1, array.getValue(0));
        array.pushFront(2);
        assertEquals(2, array.getValue(0));
        assertEquals(1, array.getValue(1));
        array.pushFront(3);
        array.pushFront(4);
        array.pushFront(5);
        array.pushFront(6);
        array.pushFront(7);
        assertEquals(3, array.getValue(4));
        assertEquals(4, array.getValue(3));
        assertEquals(5, array.getValue(2));
        assertEquals(6, array.getValue(1));
        assertEquals(7, array.getValue(0));
    }

    @Test
    public void getValue() {
        DynamicArray array = new DynamicArray();
        array.pushFront(3);
        array.pushFront(4);
        array.pushFront(5);
        array.pushFront(6);
        array.pushFront(7);
        assertEquals(3, array.getValue(4));
        assertEquals(4, array.getValue(3));
        assertEquals(5, array.getValue(2));
        assertEquals(6, array.getValue(1));
        assertEquals(7, array.getValue(0));
    }
}