import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Simulation {

    public JFrame frame = new JFrame("Safari");
    private Cell[][] cell;

    private Color emptyCol = Color.gray;
    public ArrayList<Animals> players = new ArrayList<>();
    public Simulation(int width, int height)
    {
        this.frame.setSize(width, height);
        cell = new Cell[10][10];
        setup();
    }

    private void setup()
    {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(10,10));
        panel.setSize(frame.getSize().width, frame.getSize().height);
        for(int y = 0; y < 10; y++)
        {
            for(int x = 0; x < 10; x++)
            {
                cell[y][x] = new Cell(y, x);
                panel.add(cell[y][x].getPanel());
            }
        }
        frame.add(panel);
        frame.setVisible(true);
    }

    public void addPlayer(Animals animal)
    {
        players.add(animal);
    }

    public void markAnimalPos()
    {
        for(Animals animal: players)
        {
            cell[animal.getX()][animal.getY()].animalPosition(animal.getColour());
        }
    }
    public void animalMove()
    {
        for(Animals animal: players)
        {
//            int oldX = animal.getX();
//            int oldy = animal.getY();
//            cell[animal.getX()][animal.getY()].resetColour();
            boolean check = true;
            while(check)
            {
                int newXMove = ThreadLocalRandom.current().nextInt(-animal.getSpeed(), animal.getSpeed());
                int newYMove = ThreadLocalRandom.current().nextInt(-animal.getSpeed(), animal.getSpeed());
                if(animal.tryMove(10, newXMove, newYMove))
                {
                    check = false;

                    cell[animal.getX()][animal.getY()].resetColour();
                    animal.move(newXMove,newYMove);
                }
            }

        }
    }
}

