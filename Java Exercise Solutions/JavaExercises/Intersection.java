package JavaExercises;

import java.util.ArrayList;

public class Intersection {

    public static void main(String[] args){
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list1.add(2);
        list1.add(4);
        list1.add(1);
        list1.add(56);
        list1.add(3);

        list2.add(56);
        list2.add(8);
        list2.add(2);
        list2.add(4);
        list2.add(3);

        System.out.println("List 1:");

        for(int elem : list1){
            System.out.print(elem + " ");
        }

        System.out.println();
        System.out.println("List 2:");

        for(int elem : list2){
            System.out.print(elem + " ");
        }

        ArrayList<Integer> common = new ArrayList<>();

        for(int elem : list1){
            if(list2.contains(elem)){
                common.add(elem);
            }
        }

        System.out.println();
        System.out.println("Common Elements:");

        for(int elem : common){
            System.out.print(elem + " ");
        }

    }
}
