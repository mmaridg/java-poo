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
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepararMundo();
    }
    
    private void prepararMundo(){
        addObject(new Jogador(), 300, 200);
        //coloquei meu personagem na posição a seguir. O plano cartesiano do jogo é 300x400.
        
        addObject(new Moeda(), 100, 100);
        addObject(new Moeda(), 500, 100);
        addObject(new Moeda(), 300, 300);
            
    }
}
