package composite.graphics;

import java.util.ArrayList;
import java.util.List;

public class CompositeGraphics extends GraphicsElementImpl {

    private List<GraphicsElement> compositeGraphics = new ArrayList<>();

    public void add(GraphicsElement element) {
        compositeGraphics.add(element);
    }

    public void add(List<GraphicsElement> elements) {
        compositeGraphics.addAll(elements);
    }

    @Override
    public void print() {
        for (GraphicsElement element : compositeGraphics) {
            if (this.x < element.getX()) {
                this.x = element.getX();
            }
            if (this.y < element.getY()) {
                this.y = element.getY();
            }
            this.size += element.getSize();
            element.print();
        }
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "CompositeGraphics{" +
                "x=" + x +
                ", y=" + y +
                ", size=" + size +
                '}';
    }
}
