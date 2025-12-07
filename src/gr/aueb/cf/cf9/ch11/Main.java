package gr.aueb.cf.cf9.ch11;

public class Main {

    public static void main(String[] args) {

//        Customer customer = new Customer(1L, "Giannis", "Ioannou", "176956877", "6972716452", "Attiki")



        Product milk = new Product(1L, "MIlk A", "Light Milk", 1.5, 2, true);
        Product juice = new Product(2L, "Juice A", "Orange Juice", 2.5, 1, false);





        Student student = new Student();
        Student alice = new Student();
        Student bob = new Student();

        Student student2 = new Student(4, "Makis", "Kapetis");
        student2.setFirstname("Xristostomos");
        Student student3 = new Student(5, "Lampros", "Ioannou");

//        alice.id = 1;
//        bob.id = 2;
//        student.firstname = "George";

        alice.setId(1);
        alice.setFirstname("Alice");
        alice.setLastname("Wonderland");

        bob.setId(2);
        bob.setFirstname("Bob");
        bob.setLastname("Dylan");

        student.setId(3);
        student.setFirstname("Anna");
        student.setLastname("Karenina");


        System.out.println(alice.getId());
        System.out.println(alice.getFirstname());
        System.out.println(alice.getLastname());

        System.out.printf("Id: %d, Firstname: %s, Lastname: %s%n", alice.getId(), alice.getFirstname(), alice.getLastname());

        System.out.println(Student.getStudentsCount());

    }
}
