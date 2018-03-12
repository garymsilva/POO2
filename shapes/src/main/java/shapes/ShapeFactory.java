package shapes;

import shapes.Shape;
import shapes.Circle;
import shapes.Square;
import shapes.Triangle;

/**
 * ShapeFactory
 */
public class ShapeFactory {
    
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("square")) {
            return new Square();
        } else if(shapeType.equalsIgnoreCase("triangle")) {
            return new Triangle();
        } else {
            return null;
        }
    }
}