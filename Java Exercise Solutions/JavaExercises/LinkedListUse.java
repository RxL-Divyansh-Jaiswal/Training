package JavaExercises;

public class LinkedListUse {

//    create the linkedlist
    public static Node createLL(){
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        return n1;
    }

//    print the linkedlist
    public static void print(Node head){
        if(head == null){
            return;
        }

        while(head != null){
            System.out.print(head.data + "->");
            head = head.next;
        }
    }


    public static void main(String[] args){
//        create LL
        Node head = createLL();

//        print LL
        print(head);
    }
}
