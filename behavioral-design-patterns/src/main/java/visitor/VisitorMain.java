package visitor;

import visitor.figures.Circle;
import visitor.figures.Square;
import visitor.json_visitor.JsonVisitor;

public class VisitorMain {

    public static void main(String[] args) {

        Circle circle = new Circle(3);
        Square square = new Square(4, 5);

        System.out.println(circle.accept(new JsonVisitor()));
        System.out.println(square.accept(new JsonVisitor()));

    }

}
