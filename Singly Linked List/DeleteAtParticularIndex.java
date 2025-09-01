public class DeleteAtParticularIndex {

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

    public DeleteAtParticularIndex(){
        this.size = 0;
    }

    public void DeleteAtParticular(int index){
        if (index == 0){
            DeleteFirst();
            return;
        } else if (index == size-1) {
            DeleteLast();
            return;
        }

        Node prev = getNode(index-1);

        prev.next = prev.next.next;
        size--;
    }


    public Node getNode (int index){
        Node node = head;

        for (int i =0 ;i<index; i++){
            node = node.next;
        }
        return node;
    }


    public void DeleteFirst(){
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        size--;
    }

    public void DeleteLast(){
        if(size <= 0){
            DeleteFirst();
            return ;
        }

        Node secondLast = getNode(size - 2);

        int data = tail.data;
        tail = secondLast;
        tail.next = null;
        size--;

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

        while (temp != null){
            System.out.print(temp.data +" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DeleteAtParticularIndex DAP = new DeleteAtParticularIndex();

        DAP.InsertFirst(4);
        DAP.InsertFirst(3);
        DAP.InsertFirst(2);
        DAP.InsertFirst(1);

        DAP.display();

        DAP.DeleteAtParticular(1);
        DAP.display();
    }
}
