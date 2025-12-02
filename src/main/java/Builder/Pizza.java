package Builder;

import java.util.List;

public class Pizza {
    private  PizzaSize pizzaSize;
    private  PizzaType pizzaType;

    private String cheese;
    private String toppings;
    private List<String> addons;

    @Override
    public String toString() {
        return "Pizza{" +
                "pizzaSize=" + pizzaSize +
                ", pizzaType=" + pizzaType +
                ", cheese='" + cheese + '\'' +
                ", toppings='" + toppings + '\'' +
                ", addons=" + addons +
                '}';
    }

    private Pizza(PizzaBuilder pizzaBuilder){
        this.pizzaSize=pizzaBuilder.pizzaSize;
        this.pizzaType=pizzaBuilder.pizzaType;
        this.addons=pizzaBuilder.addons;
        this.cheese = pizzaBuilder.cheese;
        this.toppings=pizzaBuilder.toppings;
    }
    private Pizza(){

    }
    public static class  PizzaBuilder{
        private  PizzaSize pizzaSize;
        private  PizzaType pizzaType;

        private String cheese;
        private String toppings;
        private List<String> addons;

        public PizzaBuilder(PizzaSize pizzaSize,PizzaType pizzaType){
            this.pizzaSize=pizzaSize;
            this.pizzaType=pizzaType;

        }

        public PizzaBuilder setCheese(String cheese){
            this.cheese=cheese;
            return  this;
        }
        public  PizzaBuilder setToppings(String toppings){
            this.toppings=toppings;
            return this;
        }
        public  PizzaBuilder setAddons(List<String> addons){
            this.addons=addons;
            return this;
        }
        public  Pizza build(){
            return  new Pizza(this);
        }
    }

}
