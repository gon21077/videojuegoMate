import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class personaje here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class personaje extends Actor
{
    /**
     * Act - do whatever the personaje wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private Goal goal = new Goal();
    
    public void act()
    {
        move();
        eat();
        
    }
    public void move()
    {
        move(50);
    }
    public void eat()
    {
        Actor goal;
        goal = getOneObjectAtOffset(0,0, Goal.class);
        if (goal != null)
        {
            getWorld().removeObject(goal);
            return;
        }
    }
    public void create()
    {
        getWorld().addObject( new Goal(), 550, 300);
    }
}
