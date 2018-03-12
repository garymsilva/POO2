package shapes;

/**
 * Hello world!
 *
 */
public class App {
    
    public static void main( String[] args ) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape myShape = shapeFactory.getShape("circle");
        myShape.draw();
        myShape = shapeFactory.getShape("square");
        myShape.draw();
        myShape = shapeFactory.getShape("triangle");
        myShape.draw();
    }
}
