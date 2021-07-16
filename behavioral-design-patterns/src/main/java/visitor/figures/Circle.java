package visitor.figures;

import visitor.json_visitor.Visitor;

public class Circle implements VisitorShape {

    private int radius;

    private double circleArea;

    public Circle(int radius) {
        this.radius = radius;
        circleArea = Math.pow(radius, 2) * 3.14;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCircle(this);
    }

    public int getRadius() {
        return radius;
    }

    public double getCircleArea() {
        return circleArea;
    }
}
