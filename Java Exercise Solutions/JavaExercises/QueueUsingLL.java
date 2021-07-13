package JavaExercises;

public class QueueUsingLL {
    private Node front;
    private Node rear;
    private int size;

    public QueueUsingLL(){
        front = null;
        rear = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

//    enqueue method
    public void enqueue(int elem){
        Node newNode = new Node(elem);
        size++;

        if(rear == null){
            front = newNode;
            rear = newNode;
        }

        rear.next = newNode;
        rear = rear.next;
    }

//    front method
    public int front(){
        if(front == null){
            return -1;
        }

        return front.data;
    }

//    dequeue method
    public int dequeue(){
        if(front == null){
            return -1;
        }

        int temp = front.data;
        front = front.next;
        if(front == null){
            rear = null;
        }
        size--;

        return temp;
    }
}
