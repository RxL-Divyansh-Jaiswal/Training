package JavaExercises;

public class MyArrayListUse {
    public static void main(String[] args){
        MyArrayList list = new MyArrayList();

        for(int i = 1; i < 100; i++){
            list.add(100 + i);
        }

        System.out.println("Number of Elements: " + list.size()); // number of elements in the list
        System.out.println("Element at index 98: " + list.get(98)); // element at 98 index
        list.update(3,170); // update element at index 3 with value 170

//        printing elements from back
        System.out.println("Elements: ");
        while(!list.isEmpty()){
            System.out.print(list.delete() + " ");
        }
    }
}
