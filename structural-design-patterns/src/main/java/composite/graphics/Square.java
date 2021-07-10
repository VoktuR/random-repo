package composite.graphics;

public class Square extends GraphicsElementImpl {

    public Square(int x, int y, int size) {
        super(x, y, size);
    }

    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Square{" +
                "x=" + x +
                ", y=" + y +
                ", size=" + size +
                '}';
    }
}
