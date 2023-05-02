import java.awt.*;

public class Gazelle extends Animals
{
    public Gazelle(int y, int x)
    {
        super(y,x);
        this.speed = 5;
        this.colour = Color.green;
        this.type = "prey";
    }
}
