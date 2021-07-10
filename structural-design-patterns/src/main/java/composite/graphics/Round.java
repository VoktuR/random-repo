package composite.graphics;

public class Round extends GraphicsElementImpl {

    public Round(int x, int y, int size) {
        super(x, y, size);
    }

    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Round{" +
                "x=" + x +
                ", y=" + y +
                ", size=" + size +
                '}';
    }
}
