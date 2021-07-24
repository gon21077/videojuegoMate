import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.*;
import java.util.*;
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
    int score = 0;
    int respuesta = numero1*numero2;
    String respuesta1 = Integer.toString(respuesta);

    public problema()
    {
        GreenfootImage puntos = new GreenfootImage("Puntos: "+Integer.toString(score), 
        40, 
        Color.BLACK, 
        Color.WHITE);
        setImage (puntos);
        
        //GreenfootImage img = new GreenfootImage(numeroS1+"*"+numeroS2, 
        //24, 
        //Color.BLACK, 
        //Color.WHITE);
        //setImage (img);
        
        //getWorld().addObject(new InputUsuario(), 100, 100);
        
    }
    /**
     * Act - do whatever the problema wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void bumpuntos()
    {
        score = score+1;
    }
}
