package SOLID;

public class Penquin extends  Bird{
    public Penquin(){

    }
    public  Penquin(String name, double age, String type){
        super(name, age, type);
    }
    @Override
    public void makeSound() {
        System.out.println("Penquin is making sound");
    }

    @Override
    public void eat() {
        System.out.println("Penquin is eating");
    }
}
