package composite.graphics;

public abstract class GraphicsElementImpl implements GraphicsElement {

    protected int x;

    protected int y;

    protected int size;

    public GraphicsElementImpl() {
    }

    public GraphicsElementImpl(int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getSize() {
        return size;
    }
}
