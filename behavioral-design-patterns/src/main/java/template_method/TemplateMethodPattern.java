package template_method;

import template_method.classes.AbstractResidentialEstate;
import template_method.classes.Apartments;
import template_method.classes.House;

public class TemplateMethodPattern {

    public static void main(String[] args) {

        AbstractResidentialEstate estate = new Apartments(300);
        System.out.println(estate.calcPropertyPrice());

        AbstractResidentialEstate estate2 = new House(500);
        System.out.println(estate2.calcPropertyPrice());

    }

}
