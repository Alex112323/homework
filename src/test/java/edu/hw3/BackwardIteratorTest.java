package edu.hw3;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class BackwardIteratorTest {
    @Test
    void check_Has_Next() {
        BackwardIterator<Integer> backwardIterator = new BackwardIterator<>(List.of(1,2,3));
        assertTrue(backwardIterator.hasNext());
    }
    @Test
    void check_Next() {
        BackwardIterator<Integer> backwardIterator = new BackwardIterator<>(List.of(1,2,3));
        assertEquals(3, backwardIterator.next());
        assertEquals(2, backwardIterator.next());
    }

    @Test
    void check_Not_Has_Next() {
        BackwardIterator<Integer> backwardIterator = new BackwardIterator<>(List.of(1));
        backwardIterator.next();
        assertFalse(backwardIterator.hasNext());
    }

}
