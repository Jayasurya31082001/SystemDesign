package SOLID;

public class Pigeon extends Bird implements  Flyable{
public  Pigeon(){

}
public  Pigeon(String name, double age, String type){
    super(name, age, type);
}
    @Override
    public void makeSound() {
        System.out.println("pigeon is making sound");
    }

    @Override
    public void eat() {
        System.out.println("pigeon is eating food");
    }

    @Override
    public void fly() {
        System.out.println("pigeon is flying");
    }
}
