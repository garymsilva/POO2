package pizza_store;

/**
 * Pizza
 */
public abstract class Pizza {

    private String flavour;

    public Pizza(String flavour) {
        this.flavour = flavour;
    }

    public void bake() {

    }

    public void prepare() {

    }

    public void cut() {

    }

    public void box() {

    }

    public String getFlavour() {
        return this.flavour;
    }
    
}