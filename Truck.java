import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Truck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Truck extends Actor
{
    private int speed;
    
    public void act() 
    {
        move(speed);
        move(-8);
        if(isAtEdge())
        {
            setLocation( 800, getY());
        }
    }  
    
    public Truck(int setSpeed)
    {
        speed = setSpeed;
    }
}
