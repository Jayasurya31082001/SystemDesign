package Prototype_And_Registry;

public class Bot implements  Enemy{
    private  String name;
    private  String color;
    private  String size;

    public Bot(String name, String color, String size) {
        this.name = name;
        this.color = color;
        this.size = size;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }


    @Override
    public Bot clone() {
        return  new Bot(this.name,this.size,this.color);
    }

    @Override
    public String toString() {
        return "Bot{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
