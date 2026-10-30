
public class App {
    public static void main(String[] args) throws Exception {
        Dog myDog = new Dog();
        myDog.name = "Mini";
        // myDog.Walk();

        Dog yourDog = new Dog("Mini", 7);
        yourDog.Data();

        Student student1 = new Student();

        student1.setName("Bryan");

        System.out.println(student1.getName());

    }
}
