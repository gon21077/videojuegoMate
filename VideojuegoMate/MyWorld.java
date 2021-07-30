import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
 
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    private puntaje puntaje;
    private personaje personaje;
    private Goal goal;
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
         
        puntaje = new puntaje();
         addObject(puntaje,500, 50);
        personaje = new personaje();
         addObject(personaje, 50, 300);
        goal = new Goal();
         addObject(goal, 550, 300);
         
    }
    public puntaje getPuntaje()
    {
        return puntaje;
    }
}
