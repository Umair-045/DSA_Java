public class Searching {

    Node head;
    Node tail;
    int size;

    class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }
    }
    public Searching (){
        this.size = 0;
    }


    public int search(int target){
        Node node = head;
        int index = 0;

        while(node != null){
            if (node.data == target){
                return index;
            }
            else{
                node = node.next;
                index++;
            }
        }
        return -1;
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
        Searching s = new Searching();

        s.InsertFirst(4);
        s.InsertFirst(3);
        s.InsertFirst(2);
        s.InsertFirst(1);

        s.display();


        System.out.println(s.search(4));
    }
}
