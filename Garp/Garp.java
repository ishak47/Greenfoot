import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
* Write a description of class Garp here.
* 
* @author (your name) 
* @version (a version number or a date)
*/
public class Garp extends Actor
{
/**
 * Act - do whatever the Garp wants to do. This method is called whenever
 * the 'Act' or 'Run' button gets pressed in the environment.
 */
private GreenfootImage imageRight; 
private GreenfootImage imageLeft ; 

public Garp()
{
imageLeft  = new GreenfootImage("GarpLeft.png");
imageRight = new GreenfootImage("GarpRight.png");    
setImage(imageRight);
}

public void act() 
{
    // Add your action code here.
    if(Greenfoot.isKeyDown("left")) {
    if(getImage() == imageRight) {
        setImage(imageLeft);
}
        setRotation(0);
        move(-5);
    }
        
        if(Greenfoot.isKeyDown("right")){          
        if(getImage() == imageLeft) {
            setImage(imageRight);
 }
 setRotation(0);
 move(5);
}
             
        if(Greenfoot.isKeyDown("up")) {
            setRotation(-90);
            move(5);
}
        if(Greenfoot.isKeyDown("down")) {
            setRotation(90);
            move(5);
}
        
    }    
}


