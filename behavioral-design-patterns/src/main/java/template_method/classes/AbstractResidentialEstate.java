package template_method.classes;

import java.math.BigDecimal;

public abstract class AbstractResidentialEstate {

    private int squarePrice;

    protected abstract BigDecimal getTaxes();

    protected abstract BigDecimal getSquare();

    public AbstractResidentialEstate(int squarePrice) {
        this.squarePrice = squarePrice;
    }

    // Template Method
    public BigDecimal calcPropertyPrice() {
        return new BigDecimal(getTaxes().doubleValue() * squarePrice + getSquare().doubleValue());
    }

}
