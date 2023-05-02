import java.awt.*;

public class Leopard extends Animals
{
    public Leopard(int y, int x)
    {
        super(x, y);
        this.speed = 4;
        this.colour = Color.red;
        this.type = "predator";
    }
}
