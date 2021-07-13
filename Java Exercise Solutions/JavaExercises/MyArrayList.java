package JavaExercises;

public class MyArrayList {

    private int[] data;
    private int nextElementIndex;

    public MyArrayList(){
        data = new int[5];
        nextElementIndex = 0;
    }

//    size of list
    public int size(){
        return nextElementIndex;
    }

//    is list empty
    public boolean isEmpty(){
        return nextElementIndex == 0;
    }

//    get method
    public int get(int i){
        if(i >= nextElementIndex){
            return -1;
        }
        return data[i];
    }

//    doubling the capacity
    public void doubleCapacity(){
        int[] temp = data;
        data = new int[temp.length * 2];

        for(int i = 0; i < temp.length; i++){
            data[i] = temp[i];
        }
    }

//    add method
    public void add(int elem){
        if(nextElementIndex == data.length){
            doubleCapacity();
        }

        data[nextElementIndex] = elem;
        nextElementIndex++;
    }

//    update method
    public void update(int index,int elem){
        if(index >= nextElementIndex){
            return;
        }
        data[index] = elem;
    }

//    delete method
    public int delete(){
        if(nextElementIndex == 0){
            return -1;
        }

        int ans = data[nextElementIndex - 1];
        nextElementIndex--;
        return ans;
    }

}
