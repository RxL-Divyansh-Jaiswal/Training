package JavaExercises;

public class PersonUse {

    public static void main(String[] args) {
        Person p = new Person();

        p.setName("Divyansh");
        p.setAge(22);
        p.setGender('M');
        p.setAddress("Rohini, New Delhi");

        System.out.println(p.getName() + ", " + p.getAge() + ", " + p.getGender() + ", lives in " + p.getAddress());
    }
}
