public class DeleteLastAtTail {

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

    public DeleteLastAtTail(){
        this.size = 0;
    }


    public void DeleteLast(){
        if(size < 1){
            DeleteFirst();
            return ;
        }

        Node secondLast = getNode(size - 2);

        int data = tail.data;
        tail = secondLast;
        tail.next = null;
        size--;

    }







public Node getNode (int index){
        Node node = head;

        for (int i=0; i<index ; i++){
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



    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }




    public static void main(String[] args) {
        DeleteLastAtTail DT = new DeleteLastAtTail();

        DT.InsertFirst(3);
        DT.InsertFirst(2);
        DT.InsertFirst(1);

        DT.display();

        DT.DeleteLast();
        DT.display();
    }
}
