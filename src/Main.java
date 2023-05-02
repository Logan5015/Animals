import java.awt.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import javax.swing.JComponent;
import javax.swing.JFrame;
public class Main {
    public static void main(String[] args) throws InterruptedException {
       Simulation safari = new Simulation(500, 500);
       safari.addPlayer(new Leopard(1,5));
       safari.addPlayer(new Gazelle(0,0));
       int counter = 0;
       while(true)
       {
           safari.markAnimalPos();
           safari.animalMove();
//           Scanner myObj = new Scanner(System.in);
           System.out.println(counter);

           counter++;
//           Thread.sleep(5);
//           String userName = myObj.nextLine();  // Read user input
//           System.out.println("Username is: " + userName);  // Output user input
       }
    }
}