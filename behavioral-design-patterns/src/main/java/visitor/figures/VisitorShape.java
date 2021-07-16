package visitor.figures;

import visitor.json_visitor.Visitor;

public interface VisitorShape {

    String accept(Visitor visitor);

}
