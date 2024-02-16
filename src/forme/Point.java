package forme;

public class Point implements Cloneable{

    private int x = 0;
    private int y = 0;

    public Point() {
    }

    public Point(int x, int y) {
        setX(x);
        setY(y);
    }

    public Point clone() throws CloneNotSupportedException
    {
        Point point = (Point)super.clone();
        return point;
    }

    public void deplaceXY(int dX, int dY) {
        setX(getX() + dX);
        setY(getY() + dY);
    }

    public void setX(int x) {
        this.x = Math.max(x, 0);
    }

    public void setY(int y) {
        this.y = Math.max(y, 0);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point : (" + getX() + ", " + getY() + ")";
    }
}
