package JavaExercises;

public class StackUsingLL {

    private Node head;
    private int size;

    public StackUsingLL(){
        head = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

//    push method
    public void push(int elem){
        Node newNode = new Node(elem);

        newNode.next = head;
        head = newNode;
        size++;
    }

//    top method
    public int top(){
        if(head == null){
            return -1;
        }

        return head.data;
    }

//    pop method
    public int pop(){
        if(head == null){
            return -1;
        }

        int temp = head.data;
        head = head.next;
        size--;

        return temp;
    }
}
