package JavaExercises;

public class QueueUse {

    public static void main(String[] args){
        QueueUsingLL q = new QueueUsingLL();
        int[] arr = {10,20,30,40,50};

        for(int elem : arr){
            q.enqueue(elem);
        }

        System.out.println("Front Element of the queue: " + q.front());

        System.out.println("Elements in the queue: ");

        while (!q.isEmpty()){
            System.out.print(q.dequeue() + " ");
        }
    }
}
