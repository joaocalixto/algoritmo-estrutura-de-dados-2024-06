import org.w3c.dom.Node;

public class SequentialSearchST<Key, Value> {

    private Node first;

    private class Node{

        private final Key key;
        private final Value val;
        private final Node next;

        public Node(Key key, Value val, Node next) {
            this.key = key;
            this.val = val;
            this.next = next;
        }


    }

}
