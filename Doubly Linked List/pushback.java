public class pushback {
    Node head;
    Node tail;
    int size;

    public pushback(){
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



    public void pushback(int data) {
        Node node = new Node(data);

        if (head == null){
            head = tail = node;
        }
        else{

            node.prev = tail;
            tail.next = node;
            tail = node;
        }

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
        pushback pb = new pushback();

        pb.pushback(3);
        pb.pushback(2);
        pb.pushback(1);

        pb.display();
    }
}

