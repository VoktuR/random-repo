package composite;

import composite.graphics.CompositeGraphics;
import composite.graphics.Round;
import composite.graphics.Square;

public class CompositeMain {

    public static void main(String[] args) {

        Round round = new Round(4 , 3, 5);
        Square square = new Square(3, 7 , 10);
        round.print();
        square.print();

        CompositeGraphics graphics = new CompositeGraphics();
        graphics.add(round);
        graphics.add(square);
        graphics.print();

    }

}
