public class Dog {
    String name;
    String color;
    int age;
    double weight;


    public Dog() {
        color = "Yellow";
    }

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    private void Walk(){
        System.out.println("I'm walking..." + color);
    }

    public void Data() {
        System.out.println(name + " " + age);
    }
}