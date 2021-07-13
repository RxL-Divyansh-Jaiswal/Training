package JavaExercises;

public class StackUse {

    public static void main(String[] args){
        StackUsingLL stack = new StackUsingLL();
        int[] arr = {5,6,7,1,9};

        for(int i = 0; i < arr.length; i++){
            stack.push(arr[i]);
        }

        System.out.println("Top Element of the stack: " + stack.top());

        System.out.println("Elements in the stack: ");

        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
    }
}
