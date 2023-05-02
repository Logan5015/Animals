import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Cell //Panel seems to be what you make things with, like the building blocks, cell is within a larger panel
{
    JPanel panel = new JPanel(); //Panel seems to be what you make things with, like the building blocks, cell is within a larger panel
    private int x, y;

    Color colour;
    public Cell(int y, int x)
    {
        this.x = x;
        this.y = y;
        this.colour = Color.gray;
        panel.setBackground(this.colour);
        panel.setBorder(new LineBorder(Color.blue));
    }

    public JPanel getPanel() {
        return panel;
    }

    public Color getColour() {
        return colour;
    }

    public void animalPosition(Color col)
    {
        if(colour != Color.gray)
        {
            System.out.println("Gazelle has been caught");
            System.exit(0);
        }
        this.colour = col;
        panel.setBackground(colour);
    }

    public void resetColour()
    {
        this.colour = Color.gray;
        panel.setBackground(colour);
    }
}
