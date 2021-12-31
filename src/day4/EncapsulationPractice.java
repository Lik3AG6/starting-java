package day4;



public class EncapsulationPractice {


    public static void main(String[] args) {


        Student student1 = new Student(); // student1 object created

        //student1.name = "Nabin";
        student1.setName("Nabin");
        //student1.dob = "12/20/1998";
        student1.setDob("12/10/1995");
        student1.setSocialSecurityNumber("321456333");
        //student1.playing();
        //student1.studying();



        Student student2 = new Student(); // student2 object created

        //student2.name = "Biwas";
        student2.setName("Biwas");
        //student2.dob = "10/14/2000";
        student2.setDob("10/14/2000");
        student2.setSocialSecurityNumber("876352746");
        //student2.playing();
        //student2.studying();



        Student student3 = new Student(); // student 3 object created

        //student3.name = "Dixya";
        student3.setName("Dixya");
        //student3.dob = "07/07/1998";
        student3.setDob("07/07/1998");
        student3.setSocialSecurityNumber("432543432");
        //student3.playing();
        //student3.studying();



        Student student4 = new Student(); // student 4 object created

        //student4.name = "Priya";
        student4.setName("Priya");
        //student4.dob = "02/10/1995";
        student4.setDob("02/10/1995");
        student4.setSocialSecurityNumber("746537716");
        //student4.playing();
        //student4.studying();

        System.out.println(student1.getName());
        System.out.println(student1.getDob());
        //System.out.println(student1.getSocialSecurityNumber());
        System.out.println("");

        System.out.println(student2.getName());
        System.out.println(student2.getDob());
        //System.out.println(student2.getSocialSecurityNumber());
        System.out.println("");

        System.out.println(student3.getName());
        System.out.println(student3.getDob());
        //System.out.println(student3.getSocialSecurityNumber());
        System.out.println("");

        System.out.println(student4.getName());
        System.out.println(student4.getDob());
        //System.out.println(student4.getSocialSecurityNumber());
        System.out.println("");

    }
}