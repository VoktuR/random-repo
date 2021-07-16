package visitor.json_visitor;

import visitor.figures.Circle;
import visitor.figures.Square;

public class JsonVisitor implements Visitor {

    @Override
    public String visitSquare(Square square) {
        return "{\n" +
                "'height' : " + square.getHeight() + ", \n" +
                "'width' : " + square.getWidth() + ", \n" +
                "'squareArea' : " + square.getSquareArea() + ", \n" +
                "}";
    }

    @Override
    public String visitCircle(Circle circle) {
        return"{\n" +
                "'radius' : " + circle.getRadius() + ", \n" +
                "'circleArea' : " + circle.getCircleArea() + ", \n" +
                "}";
    }

}
