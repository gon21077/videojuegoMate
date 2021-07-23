import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class problema here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class problema extends Actor
{
    int numero1 = Greenfoot.getRandomNumber(100);
    int numero2 = Greenfoot.getRandomNumber(100);
    String numeroS1 = Integer.toString(numero1);
    String numeroS2 = Integer.toString(numero2);

    public problema()
    {
        GreenfootImage img = new GreenfootImage(numeroS1+"*"+numeroS2, 
        24, 
        Color.BLACK, 
        Color.WHITE);
        setImage (img);
    }
    /**
     * Act - do whatever the problema wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
