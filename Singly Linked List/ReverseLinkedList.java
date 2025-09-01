public class ReverseLinkedList {

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

    public ReverseLinkedList(){
        this.size = 0;
    }

    public void reverse(){
        Node prev = null;
        Node curr = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }


    public void InsertFirst(int data){

        Node node = new Node(data);
        if (head == null){
            head = tail = node;
            return;
        }
        node.next = head;
        head = node;
        size++;
    }


    public void display (){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.data +" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        ReverseLinkedList rev = new ReverseLinkedList();

        rev.InsertFirst(4);
        rev.InsertFirst(3);
        rev.InsertFirst(2);
        rev.InsertFirst(1);

        rev.display();

        rev.reverse();
        rev.display();
    }
}
