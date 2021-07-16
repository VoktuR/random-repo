package template_method.classes;

import java.math.BigDecimal;

public class House extends AbstractResidentialEstate {

    public House(int squarePrice) {
        super(squarePrice);
    }

    @Override
    protected BigDecimal getTaxes() {
        return new BigDecimal(25);
    }

    @Override
    protected BigDecimal getSquare() {
        return new BigDecimal(200);
    }

}
