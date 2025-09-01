 public class PopFront {
    Node head;
    Node tail;
    int size;

    public PopFront(){
        this.size = 0;
    }

    public class Node{
        int data;
        Node next;
        Node prev;

        public Node (int data){
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


    public void popfront(){
        if (head == null ){
            System.out.println("List is empty");
        }
        Node temp = head;
        head = head.next;
        if(head != null){
            head.prev = null;
        }
        temp.next = null;
        size--;
    }

    public void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+ " <=> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        PopFront ppf = new PopFront();
        ppf.pushfront(3);
        ppf.pushfront(2);
        ppf.pushfront(1);

        ppf.display();


        ppf.popfront();
        ppf.display();
    }
}
