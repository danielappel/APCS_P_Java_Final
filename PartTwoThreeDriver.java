
import kareltherobot.*;
import java.awt.Color;

public class PartTwoThreeDriver implements Directions
{
    public static void main(String args[])  {
        PartTwo karel = new PartTwo(1, 1, East, 0);  
        //Add your code for karel below
        
        karel.turnOff();  
        
        PartThree carl = new PartThree(1, 1, East, -1);
        //Add your code for carl below
        
        carl.turnOff();
    } 

    static {
        World.reset(); 
        World.readWorld("worldOne.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(50);  
        World.setVisible(true);
    }
}