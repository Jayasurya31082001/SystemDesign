package SOLID;

public class Crow extends Bird implements  Flyable{
    public  Crow(){

    }
    public Crow(String name, double age, String type){
        super(name, age, type);
    }
    @Override
    public void makeSound() {
        System.out.println("Crow is making sound");
    }

    @Override
    public void eat() {
        System.out.println("Crow is eating");
    }

    @Override
    public void fly() {
        System.out.println("Crow is flying");
    }
}
