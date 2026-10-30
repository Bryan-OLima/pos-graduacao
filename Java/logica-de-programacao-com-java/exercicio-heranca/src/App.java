public class App {
    public static void main(String[] args) throws Exception {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.setName("Bidu");
        cat.setName("Lola");

        dog.show();
        cat.show();
    }
}
