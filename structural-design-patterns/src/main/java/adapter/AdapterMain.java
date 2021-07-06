package adapter;

import adapter.figures.RoundFigure;
import adapter.figures.SquareFigure;
import adapter.hole.RoundHoleImpl;
import adapter.hole.SquareHoleAdapter;

public class AdapterMain {

    public static void main(String[] args) {
        RoundFigure roundFigure = new RoundFigure(5);
        RoundHoleImpl hole = new RoundHoleImpl(15);

        System.out.println(hole.isFit(roundFigure));

        SquareFigure squareFigure = new SquareFigure(3, 4);
        SquareFigure squareFigure2 = new SquareFigure(15,20);

        /**
         * Нелья это сделать из-зв несовпадения в интерфейсе
         */
        // System.out.println(hole.isFit(squareFigure));

        SquareHoleAdapter squareHoleAdapter = new SquareHoleAdapter(squareFigure);
        SquareHoleAdapter squareHoleAdapter2 = new SquareHoleAdapter(squareFigure2);
        System.out.println(hole.isFit(squareHoleAdapter));
        System.out.println(hole.isFit(squareHoleAdapter2));
    }

}
