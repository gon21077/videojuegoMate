import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.*;
import java.util.*;
/**
 * Write a description of class InputUsuario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InputUsuario extends Actor
{
    private personaje personaje = new personaje();
    private InputUsuario1 InputUsuario1 = new InputUsuario1();
    int numero1 = Greenfoot.getRandomNumber(10);
    int numero2 = Greenfoot.getRandomNumber(10);
    String numeroS1 = Integer.toString(numero1);
    String numeroS2 = Integer.toString(numero2);
    int respuesta = numero1*numero2;
    String respuesta1 = Integer.toString(respuesta);

    public InputUsuario()
    {
        
        String inputstring = JOptionPane.showInputDialog(numeroS1+"*"+numeroS2);
        
        if(inputstring.equals(respuesta1))
        {
         personaje personaje = new personaje();
         personaje.move();
         getWorld().addObject(new InputUsuario1(), 100, 100);
        }
        else
        {
        getWorld().addObject(new gameover(), 100, 100);
        }
    }
    /**
     * Act - do whatever the InputUsuario wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
