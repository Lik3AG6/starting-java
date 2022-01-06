package day5;

public class PolymorphismPractice {

    public static void main(String[] args) {

        // Example of polymorphism in the case of object, which is only possible because of inheritance.
        // Parents class variable can hold the "objects" of child class.
        // Also called implicit type casting.

        Person person;

        person = new Student();
        person.setName("Nabin");
        person.setAge(23);
        ((Student)person).setStudentClass(12); // explicit type casting.

        person = new Teacher();
        person.setName("Hari");
        person.setAge(30);
        ((Teacher)person).setSubject("Mac 281 teacher"); // explicit type casting



        // List of Person Class

    }



    // Example : Here we have created a same name function but with different parameters list. This is called polymorphism in the case of " Functions/Methods/Behaviours ".
    // On the basis of parameters.
    // On the basis of types of parameters.


    public static void add(int a, int b){
        int temp = a + b;
        System.out.println(temp);
    }

    public static void add(int a, int b, int c){
        int temp = a + b + c;
        System.out.println(temp);
    }

    public static void add(float a, float b){
        float temp = a +b;
        System.out.println(temp);
    }
}
