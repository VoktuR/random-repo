package adapter.hole;

import adapter.figures.RoundFigure;
import adapter.figures.SquareFigure;

public class SquareHoleAdapter extends RoundFigure {

    private SquareFigure figure;

    public SquareHoleAdapter(SquareFigure figure) {
        super(0);
        this.figure = figure;
        this.radius = findDiameter(figure);
    }

    private double findDiameter(SquareFigure figure) {
        return Math.sqrt(Math.pow(figure.getLength(), 2) + Math.pow(figure.getWidth(), 2)) / 2;
    }

}
