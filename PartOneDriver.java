
import kareltherobot.*;
import java.awt.Color;

public class PartOneDriver implements Directions
{
    public static void main(String args[])  {
        PartOne karel = new PartOne(1, 1, East, 0);  
        
        karel.buildHouse();
        
        karel.turnOff();  
    } 

    static {
        World.reset(); 
        World.readWorld("worldTwo.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(50);  
        World.setVisible(true);
    }
}