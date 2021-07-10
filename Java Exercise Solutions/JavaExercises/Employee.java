package JavaExercises;

import java.util.Comparator;

public class Employee {

    private int id;
    private String name;
    private int age;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }


    public String getEmpName() {
        return name;
    }

    public void setEmpName(String empName) {
        this.name = empName;
    }

    public int getEmpId() {
        return id;
    }

    public void setEmpId(int empId) {
        this.id = empId;
    }

    public int getEmpAge() {
        return age;
    }

    public void setEmpAge(int empAge) {
        this.age = empAge;
    }

    //  comparator to sort by id in descending order
    public static Comparator<Employee> idComparator = new Comparator<Employee>() {

        public int compare(Employee emp1, Employee emp2) {

            int id1 = emp1.getEmpId();
            int id2 = emp2.getEmpId();

            return id2 - id1;
        }
    };

    //  comparator to sort by name in ascending order
    public static Comparator<Employee> nameComparator = new Comparator<Employee>() {

        public int compare(Employee emp1, Employee emp2) {
            String name1 = emp1.getEmpName().toUpperCase();
            String name2 = emp2.getEmpName().toUpperCase();

            return name1.compareTo(name2);

        }
    };

    //  comparator to sort by age in descending order
    public static Comparator<Employee> ageComparator = new Comparator<Employee>() {

        public int compare(Employee emp1, Employee emp2) {

            int age1 = emp1.getEmpAge();
            int age2 = emp2.getEmpAge();

            return age2 - age1;
        }
    };

}
