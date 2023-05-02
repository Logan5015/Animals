import java.awt.*;

public abstract class Animals
{
    protected int speed, x, y;
    protected String type;
    protected Color colour;
    public Animals(int y, int x)
    {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getSpeed() {
        return speed;
    }

    public Color getColour() {
        return colour;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void move(int xMove, int yMove)
    {
        this.x += xMove;
        this.y += yMove;
    }

    public boolean tryMove(int num, int nx, int ny)
    {
        int tryX = this.x + nx;
        int tryY = this.y + ny;

        if((tryX >= 0) && (tryY >= 0) && (tryX < num) && (tryY < num))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
