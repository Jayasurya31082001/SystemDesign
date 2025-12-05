package Flyweight;

import java.util.HashMap;

public class CircleFlyweight {
    private static HashMap<String,Circle> registry=new HashMap<>();


    public static Shape getCircle(String color){
        Circle circle= registry.getOrDefault(color,null);
        if(circle==null){
            circle=new Circle(color);
           registry.put(color,circle);
        }
        return circle;
    }



}
