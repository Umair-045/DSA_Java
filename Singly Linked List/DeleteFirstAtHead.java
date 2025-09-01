public class DeleteFirstAtHead {

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
    public DeleteFirstAtHead (){
        this.size = 0;
    }


    public void InsertFirst(int data){
        Node node = new Node(data);

        if (head == null) {
            head = tail = node;
        }
        else{
        node.next = head;
        head = node;
        }

        size++;
    }

    public void DeleteFirst(){
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        size--;
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
        DeleteFirstAtHead DF = new DeleteFirstAtHead();

        DF.InsertFirst(3);
        DF.InsertFirst(2);
        DF.InsertFirst(1);

        DF.display();

        DF.DeleteFirst();
        DF.display();
    }
}
