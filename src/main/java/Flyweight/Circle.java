package Flyweight;

public class Circle implements Shape{
private String color;
public Circle(String color){
    this.color=color;
}
    @Override
    public void draw( int radius) {
        System.out.println("Drawing circle in "+color+" color.");
    }
}
