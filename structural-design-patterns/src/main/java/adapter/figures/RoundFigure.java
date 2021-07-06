package adapter.figures;

public class RoundFigure {

    protected double radius;

    public RoundFigure(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return this.getRadius() * 2;
    }

    public double getRadius() {
        return radius;
    }
}
