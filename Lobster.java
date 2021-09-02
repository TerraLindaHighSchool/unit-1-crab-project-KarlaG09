import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author Karla Gonzalez 
 * @version 8/31/21
 */
public class Lobster extends Actor
{
   public void act()  
   {
       move(3);
       turnAtEdge();
    }

    private void turnAtEdge()
    {
       if (isAtEdge())
        
        turn(50); 
    }
}
