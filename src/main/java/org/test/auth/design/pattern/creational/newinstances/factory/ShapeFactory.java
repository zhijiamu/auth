package org.test.auth.design.pattern.creational.newinstances.factory;

import org.test.auth.design.pattern.creational.newinstances.factory.models.Circle;
import org.test.auth.design.pattern.creational.newinstances.factory.models.Rectangle;
import org.test.auth.design.pattern.creational.newinstances.factory.models.Shape;
import org.test.auth.design.pattern.creational.newinstances.factory.models.Square;

public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
