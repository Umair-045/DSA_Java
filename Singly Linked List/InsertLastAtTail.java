public class InsertLastAtTail {

    Node head;
    Node tail;
    int size;

    class Node {
        int data ;
        Node next;

        public Node (int data){
            this.data = data;
            next = null;
        }
    }

    public InsertLastAtTail (){
        this.size = 0;
    }


    public void InsertFirst(int data){
        Node node = new Node(data);

        if(head == null){
            head = tail = node;
        }
        else {
            node.next = head;
            head = node;
        }
        size++;

    }

    public void InsertLast(int data){
        Node node = new Node(data);

        if (head == null){
            InsertFirst(data);
            return;
        }
        tail.next = node ;
        tail = node;

        size++;
    }


    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
       InsertLastAtTail IT = new InsertLastAtTail();

       IT.InsertFirst(3);
       IT.InsertFirst(2);
       IT.InsertFirst(1);
       IT.display();

       IT.InsertLast(4);
       IT.display();
    }
}
