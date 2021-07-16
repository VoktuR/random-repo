package visitor.json_visitor;

import visitor.figures.Circle;
import visitor.figures.Square;

public interface Visitor {

    String visitSquare(Square square);

    String visitCircle(Circle circle);

}
