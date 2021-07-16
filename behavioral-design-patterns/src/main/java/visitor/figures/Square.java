package visitor.figures;

import visitor.json_visitor.Visitor;

public class Square implements VisitorShape {

    private int height;
    private int width;
    private int squareArea;

    public Square(int height, int width) {
        this.height = height;
        this.width = width;
        squareArea = height * width;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitSquare(this);
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getSquareArea() {
        return squareArea;
    }
}
