public class BubbleSortLinkedList {
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
    public BubbleSortLinkedList (){
        this.size = 0;
    }

    public void Sort(){
        int count = 0;
        Node temp = head;

            while (temp != null){
                temp = temp.next;
                count++;
            }


        System.out.println("Number of Nodes : "+ count);


        for (int i = 0; i < count; i++) {
            Node curr = head;
            Node next = curr.next;
            for (int j = 0; j < count-i-1; j++) {

                if (curr.data > next.data){
                    int swap = curr.data;
                    curr.data = next.data;
                    next.data = swap;
                }

                curr = next;
                next = next.next;
            }
        }
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
        BubbleSortLinkedList BS = new BubbleSortLinkedList();

        BS.InsertFirst(4);
        BS.InsertFirst(2);
        BS.InsertFirst(1);
        BS.InsertFirst(3);

        BS.display();

        BS.Sort();
        BS.display();
    }
}




