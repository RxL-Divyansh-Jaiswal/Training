package JavaExercises;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeUse {

    public static void main(String[] args){
        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101,"Akash",25));
        list.add(new Employee(102,"Gaurav",28));
        list.add(new Employee(108,"Pragya",22));
        list.add(new Employee(202,"Shuarya",30));

//       Sorting by id
        Collections.sort(list, Employee.idComparator);
        System.out.println("List of Employees sorted by id in descending order:");

        for(Employee emp : list){
            System.out.println(emp.getEmpId() + " " + emp.getEmpName() + " " + emp.getEmpAge());
        }

//        Sorting by name
        Collections.sort(list, Employee.nameComparator);
        System.out.println("List of Employees sorted by name in ascending order:");

        for(Employee emp : list){
            System.out.println(emp.getEmpId() + " "  + emp.getEmpName() + " " + emp.getEmpAge());
        }

//        Sorting by age
        Collections.sort(list, Employee.ageComparator);
        System.out.println("List of Employees sorted by age in descending order:");

        for(Employee emp : list){
            System.out.println(emp.getEmpId() + " " + emp.getEmpName() + " " + emp.getEmpAge());
        }
    }
}
