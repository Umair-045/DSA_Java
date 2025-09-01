public class InsertFirstAtHead {
    Node head;
    Node tail;
    int size ;

    public InsertFirstAtHead(){
        this.size = 0;

    }

    class Node{
        int data;
        Node next;

        public Node (int data){
            this.data = data;
            next = null;
        }
    }

    public void InsertFirst(int data){
        Node node = new Node(data);

        if(head == null){
            head = tail = node;
        }
        else{
        node.next = head;
        head = node;
        }

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
        InsertFirstAtHead IH = new InsertFirstAtHead();

        IH.InsertFirst(3);
        IH.InsertFirst(2);
        IH.InsertFirst(1);

        IH.display();
    }
}
