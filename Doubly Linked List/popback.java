public class popback {
    Node head;
    Node tail;
    int size;

    public popback(){
        this.size = size;
        head = null;
        tail = null;

    }

    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
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

    public void popback(){
        if (head == null){
            System.out.println("List is empty");
        }
        Node temp = tail;
        tail = tail.prev;

        if (tail != null){
            tail.next = null;
        }
        temp.prev = null;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " <=> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        popback ppb = new popback();

        ppb.pushfront(3);
        ppb.pushfront(2);
        ppb.pushfront(1);

        ppb.display();

        ppb.popback();

        ppb.display();
    }
}
