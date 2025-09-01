public class PushFront {
    Node head;
    Node tail;
    int size;

    public PushFront() {
        this.size = 0;
    }

    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            next = null;
            prev = null;
        }
    }


    public void pushfront(int data) {
        Node node = new Node(data);

        if (head == null) {
            head = tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
        size++;
    }


    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <=> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        PushFront pf = new PushFront();

        pf.pushfront(4);
        pf.pushfront(3);
        pf.pushfront(2);
        pf.pushfront(1);

        pf.display();
    }
}