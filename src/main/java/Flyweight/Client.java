package Flyweight;

public class Client {
    public static void main(String[] args) {
        Shape red = CircleFlyweight.getCircle("red");
        red.draw(2);
        Shape green = CircleFlyweight.getCircle("blue");
        green.draw(2);
        Shape red2 = CircleFlyweight.getCircle("red");
        red2.draw(4);


    }
}
