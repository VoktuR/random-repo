package adapter.figures;

public class SquareFigure {

    private double length;

    private double width;

    public SquareFigure(double length, double width) {
        this.length = length;
        this.width = width;
    }

    private double getSquare() {
        return this.getLength() * this.getWidth();
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}
