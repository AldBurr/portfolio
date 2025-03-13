package unit08;

import static org.junit.jupiter.api.Assertions.assertEquals;

import unit08.unit08mcf.NodeQueue;

public class NodeQueueTest {

    public void testDequeue()
    {
        String value1 = "A";
        String val2;
        NodeQueue queue = new NodeQueue(null, null, 0);
        assertEquals(queue.size(), 0);
        assertEquals(val2, queue);
    }
}
