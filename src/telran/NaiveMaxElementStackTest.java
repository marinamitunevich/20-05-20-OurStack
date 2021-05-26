package telran;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NaiveMaxElementStackTest {
    NaiveMaxElementStack<Integer> ourStack;

    @BeforeEach
    void setUp() {
        ourStack = new NaiveMaxElementStack<>();
    }

    @Test
    void testAddLast() {
        ourStack.addLast(10);
        ourStack.addLast(40);
        assertEquals(40, ourStack.getLast());
    }

    @Test
    void getLast() {
    }

    @Test
    void removeLast() {
    }

    @Test
    void getMax() {
        ourStack.addLast(10);
        ourStack.addLast(40);
        ourStack.addLast(50);
        ourStack.addLast(30);
        ourStack.addLast(5);
        assertEquals(50, ourStack.getMax());
        ourStack.removeLast();
        ourStack.removeLast();
        ourStack.removeLast();
        assertEquals(40, ourStack.getMax());

    }

    @Test
    void size() {
    }
}