public class InsertAtParticularIndex {

    Node head;
    Node tail;
    int size;

    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    public InsertAtParticularIndex(){
        this.size = 0;
    }



    public void InsertAtParticular(int data , int index){

        if (index == 0){
            InsertFirst(data);
            return;
        } else if (index == size) {
            InsertLast(data);
            return;
        }
        Node node = new Node(data);
        Node prev = getNode(index-1);
        node.next = prev.next;
        prev.next = node;

        size++;
    }


    public Node getNode (int index){
        Node node = head;

        for (int i =0 ;i<index; i++){
            node = node.next;
        }
        return node;
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
        InsertAtParticularIndex IAP = new InsertAtParticularIndex();

        IAP.InsertFirst(4);
        IAP.InsertFirst(3);
        IAP.InsertFirst(1);

        IAP.display();

        IAP.InsertAtParticular(2,1);
        IAP.display();

    }
}
