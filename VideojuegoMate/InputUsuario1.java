import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.*;
import java.util.*;
/**
 * Write a description of class InputUsuario1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InputUsuario1 extends Actor
{
    int numero1 = Greenfoot.getRandomNumber(100);
    int numero2 = Greenfoot.getRandomNumber(100);
    String numeroS1 = Integer.toString(numero1);
    String numeroS2 = Integer.toString(numero2);
    int score = 0;
    int respuesta = numero1*numero2;
    String respuesta1 = Integer.toString(respuesta);

    public InputUsuario1()
    {
        String inputstring = JOptionPane.showInputDialog(numeroS1+"*"+numeroS2);
        
        if(inputstring.equals(respuesta1))
        {
         GreenfootImage puntos = new GreenfootImage("Bien Hecho!", 
        40, 
        Color.BLACK, 
        Color.WHITE);
        setImage (puntos);
        }
        else
        {
        getWorld().addObject(new InputUsuario1(), 100, 100);
        }
    }
    /**
     * Act - do whatever the InputUsuario1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
