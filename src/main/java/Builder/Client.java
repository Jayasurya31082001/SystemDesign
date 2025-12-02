package Builder;

import java.util.ArrayList;
import java.util.List;

import static Builder.PizzaSize.LARGE;
import static Builder.PizzaSize.MEDIUM;
import static Builder.PizzaType.NORMAL;
import static Builder.PizzaType.THINCRUST;

public class Client {
    public static void main(String[] args) {
        List<String> addons = new ArrayList<>();
        addons.add("periperi");
        addons.add("mio");
        Pizza smallPizza = new Pizza.PizzaBuilder(LARGE,THINCRUST)
                .setCheese("1Slice").setToppings("Onion and panneer")
                .setAddons(addons)
                .build();
        System.out.println(smallPizza.toString());

        Pizza bigPizza = new Pizza.PizzaBuilder(MEDIUM,NORMAL)
                .setAddons(addons)
                .build();
        System.out.println(bigPizza.toString());
    }
}
