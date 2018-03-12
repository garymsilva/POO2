import pizza_store.Pizza;
import pizza_store.PizzaStore;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        PizzaStore myStore = new PizzaStore();
        Pizza myPizza;

        myPizza = myStore.orderPizza("cheese");
        System.out.println(myPizza.getFlavour());

        myPizza = myStore.orderPizza("clam");
        System.out.println(myPizza.getFlavour());

        myPizza = myStore.orderPizza("pepperoni");
        System.out.println(myPizza.getFlavour());

        myPizza = myStore.orderPizza("veggie");
        System.out.println(myPizza.getFlavour());
    }
}
