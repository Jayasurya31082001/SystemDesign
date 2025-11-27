package SOLID;

public class Client {
    public static void main(String[] args) {
        Bird bird = new Pigeon("crow",2.0,"flyable");

        bird.eat();
        bird.makeSound();
        if(bird instanceof  Flyable) {
            ((Flyable) bird).fly();
        }
    }
}
