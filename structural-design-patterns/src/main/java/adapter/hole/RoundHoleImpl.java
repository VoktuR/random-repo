package adapter.hole;

import adapter.figures.RoundFigure;

public class RoundHoleImpl implements RoundHole {

    public double diameter;

    public RoundHoleImpl(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public boolean isFit(RoundFigure figure) {
        return (this.getDiameter() >= figure.getDiameter());
    }

    public double getDiameter() {
        return diameter;
    }
}
