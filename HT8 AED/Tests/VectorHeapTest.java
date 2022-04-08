import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VectorHeapTest {

    @Test
    void InsertAndRemove() {
        PriorityQueue<Integer> pq = new VectorHeap<Integer>();
        pq.add(15);
        pq.add(20);
        pq.add(10);

        assertEquals(10,pq.remove());
        assertEquals(15,pq.remove());
        assertEquals(20,pq.remove());
    }

}