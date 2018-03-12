package pizza_store;

import pizza_store.Pizza;
import pizza_store.PizzaFactory;

/**
 * PizzaStore
 */
public class PizzaStore {
    public Pizza orderPizza(String pizzaFlavour) {
        PizzaFactory factory = new PizzaFactory();
        return factory.createPizza(pizzaFlavour);
    }
}
