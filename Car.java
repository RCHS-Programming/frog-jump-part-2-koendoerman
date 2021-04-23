import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Actor
{
    private int speed;
    
    public void act() 
    {
        move(speed);
        move(5);
        if(isAtEdge())
        {
            setLocation( 0, getY());
        }
    }   
    
    public Car(int setSpeed)
    {
        speed = setSpeed;
    }
}
