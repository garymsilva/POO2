package pizza_store;

import pizza_store.Pizza;
import pizza_flavours.*;

/**
 * PizzaFactory
 */
public class PizzaFactory {
    public Pizza createPizza(String tipoPizza) {
        
        if (tipoPizza.equalsIgnoreCase("cheese")) {
            return new CheesePizza();
        } else if (tipoPizza.equalsIgnoreCase("clam")) {
            return new ClamPizza();
        } else if (tipoPizza.equalsIgnoreCase("pepperoni")) {
            return new PepperoniPizza();
        } else if (tipoPizza.equalsIgnoreCase("veggie")) {
            return new VeggiePizza();
        } else {
            return null;
        }
    }
}
