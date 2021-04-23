import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Roadway for the Frog Jump game.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FrogWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public FrogWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        makeGround();
        addCars();
        addTrucks();
        addObject( new Frog(), 370, 510);
    }
    
    public void makeGround()
    {
        //Bottom safe ground row
        for(int i = 0; i < 14; i++)
        {
            addObject( new Ground(), 10 + 60*i, 570);
        }
        
        for(int i = 0; i < 14; i++)
        {
            addObject( new Ground(), 10 + 60*i, 270);
        }
        
        for(int i = 0; i < 14; i++)
        {
            addObject( new Ground(), 10 + 60*i, 30);
        }
        
        //Next safe ground row
        for(int i = 0; i < 14; i++)
        {
            addObject( new Ground(), 10 + 60*i, 510);
        }
        
        //Add random grass
        for(int i = 0; i < 10; i++)
        {
            int x = Greenfoot.getRandomNumber(700) + 50;
            int y = Greenfoot.getRandomNumber(100) + 500; 
            addObject( new Grass(), x, y);
        }
    }
    
    public void addCars()
    {
        addObject( new Car(5), 30, 450);
        addObject( new Car(5), 350, 450);
        
        addObject( new Car(5), 110, 390 );
        addObject( new Car(5), 750, 390 );
        
        addObject( new Car(6), 70, 330);
        addObject( new Car(7), 450, 330);
    }
    
    public void addTrucks()
    {
        addObject( new Truck(-8), 600, 210);
        
        addObject( new Truck(-9), 30, 150);

        addObject( new Truck(-10), 450, 90);        
        
    }
}
