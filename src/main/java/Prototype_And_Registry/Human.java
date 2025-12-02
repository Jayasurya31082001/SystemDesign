package Prototype_And_Registry;

public class Human implements Enemy{
    private  String name;
    private  String color;
    private  String size;
    private  boolean isRecoll;

    public Human(String name, String color, String size, boolean isRecoll) {
        this.name = name;
        this.color = color;
        this.size = size;
        this.isRecoll = isRecoll;
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

    public boolean isRecoll() {
        return isRecoll;
    }

    public void setRecoll(boolean recoll) {
        isRecoll = recoll;
    }

    @Override
    public Human clone() {
        return  new Human(this.name,this.size,this.color,this.isRecoll);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", isRecoll=" + isRecoll +
                '}';
    }
}
