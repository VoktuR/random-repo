package template_method.classes;

import java.math.BigDecimal;

public class Apartments extends AbstractResidentialEstate {

    public Apartments(int squarePrice) {
        super(squarePrice);
    }

    @Override
    protected BigDecimal getTaxes() {
        return new BigDecimal(15);
    }

    @Override
    protected BigDecimal getSquare() {
        return new BigDecimal(50);
    }

}
