package SOLID;

public abstract class Bird {
   private String name;
   private double age;
   private String type;
   public  Bird(){

   }
    public Bird(String name, double age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public abstract void makeSound();
    public abstract  void eat();
}
