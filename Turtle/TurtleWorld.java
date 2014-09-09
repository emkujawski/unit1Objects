import java.awt.Color;

import java.util.concurrent.TimeUnit;
public class TurtleWorld
{
    public static void main(String args[])
        throws InterruptedException
    {
        World turtleWorld = new World(1000,1000);
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setPenColor(Color.RED);
        Turtle turtle2 = new Turtle(turtleWorld);
        
        Thread.sleep(100); // sleep 1000 milliseconds (1 second)
        
        turtle.penDown();
            turtle.forward(50);
            Thread.sleep(100);
            turtle.turnRight();
            Thread.sleep(100);
            turtle.forward(50);
            Thread.sleep(100);
            turtle.turnRight();
            Thread.sleep(100);
            turtle.forward(50);
            Thread.sleep(100);
            turtle.turnRight();
            Thread.sleep(100);
            turtle.forward(50);
            Thread.sleep(100);
        turtle.setPenColor(Color.BLUE);
            turtle.forward(50);
            Thread.sleep(100);
            turtle.turnRight();
            Thread.sleep(100);
            turtle.forward(50);
            Thread.sleep(100);
            turtle.turnRight();
            Thread.sleep(100);
            turtle.forward(50);
            Thread.sleep(100);
            
        turtle.penUp();
            turtle.turnRight();
            Thread.sleep(100);
            turtle.forward(52);
        turtle.penDown();
            turtle.turnLeft();
            Thread.sleep(100);
            
        turtle.setPenColor(Color.GREEN);
            turtle.forward(50);
            Thread.sleep(100);
            turtle.turnRight();
            Thread.sleep(100);
            turtle.forward(50);
            Thread.sleep(100);
            turtle.turnRight();
            Thread.sleep(100);
            
            turtle.forward(50);
            Thread.sleep(100);
            turtle.turnRight();
            Thread.sleep(100);
            turtle.forward(50);
        turtle.setPenColor(Color.ORANGE);
            turtle.turnLeft();
            Thread.sleep(100);
            turtle.forward(50);
            Thread.sleep(100);
            turtle.turnLeft();
            Thread.sleep(100);
            turtle.forward(50);
            Thread.sleep(100);
            turtle.turnLeft();
            Thread.sleep(100);
            turtle.forward(48);
            Thread.sleep(100);
            turtle.turnLeft();
            Thread.sleep(100);
            turtle.forward(50);
        turtle.penUp();
            turtle.forward(54);
            Thread.sleep(100);
        turtle.penDown();
            turtle.setPenColor(Color.PINK);
            turtle.turnLeft();
            Thread.sleep(100);
            turtle.forward(48);
            Thread.sleep(100);
            turtle.turnRight();
            Thread.sleep(100);
            turtle.forward(50);
            Thread.sleep(100);
            turtle.turnRight();
            Thread.sleep(100);
            turtle.forward(50);
            Thread.sleep(100);
            turtle.turnRight();
            Thread.sleep(100);
            
            turtle.forward(50);
            Thread.sleep(100);
            turtle.turnLeft();
            Thread.sleep(100);
        turtle.setPenColor(Color.BLACK);
            turtle.forward(50);
            Thread.sleep(100);
            turtle.turnLeft();
            Thread.sleep(100);
            turtle.forward(50);
            Thread.sleep(100);
            turtle.turnLeft();
            Thread.sleep(100);
            turtle.forward(49);
            Thread.sleep(100);
            turtle.turnLeft();
            Thread.sleep(100);
            turtle.forward(50);
        turtle.penUp();
        
        
        turtle2.setShellColor(Color.BLACK);
        turtle2.setPenWidth(25);
        turtle2.setPenColor(Color.BLUE);
        turtle2.penUp();
        Thread.sleep(100);
        turtle2.turnLeft();
        Thread.sleep(100);
        turtle2.turnLeft();
        Thread.sleep(100);
        turtle2.forward(50);
        Thread.sleep(100);
        turtle2.penDown();
        Thread.sleep(100);
        turtle2.forward(100);
        Thread.sleep(100);
        turtle2.turnRight();
        Thread.sleep(100);
        turtle2.forward(200);
        Thread.sleep(100);
        turtle2.turnRight();
        Thread.sleep(100);
        
        turtle2.forward(100);
        Thread.sleep(100);
        turtle2.setPenWidth(1);
        Thread.sleep(100);
        turtle2.setPenColor(Color.ORANGE);
        turtle2.forward(150);
        Thread.sleep(100);
        turtle2.turnLeft();
        int counter4 = 0;
        while (counter4 <= 10)
        {
        turtle2.turn(-45);
        
        Thread.sleep(10);
        counter4 += 1;
        turtle2.forward(50);
    
        Thread.sleep(10);
        turtle2.turn(-90);
        Thread.sleep(10);
        turtle2.forward(50);
        Thread.sleep(10);
        
        turtle2.turn(-160);
        turtle2.forward(50);
        Thread.sleep(10);
    }
        
        turtle2.penUp();
        turtle.penUp();
        turtle2.turn(-100);
        turtle2.forward(250);

        int counter = 0;
        
       
        turtle2.turn(100);
        turtle2.turn(95);
        turtle2.forward(40);
        turtle2.turnRight();
        turtle2.forward(20);
        Thread.sleep(1000);
        turtle2.penDown();
        while (counter <= 60)
        {
            int length = 0;
            turtle2.setPenColor(Color.BLACK);
            Thread.sleep(10);
            length = counter + 40;
            turtle2.turnLeft();
            turtle2.forward(length);
            counter += 1;
       
    
       
        }
       turtle.turnToFace(turtle2);
       turtle.forward(185);
       turtle.turnToFace(500,0);
       int counter2 = 0;
       turtle.penDown();
       Thread.sleep(100);
       turtle.setPenColor(Color.PINK);
       while (counter2 <= 38)
        {
            int length2 = 0;
            Thread.sleep(10);
            length2 = counter2 + 2;
            turtle.turnLeft();
            turtle.forward(length2);
            counter2 += 1;
       
    
       
        }
        turtle2.setColor(Color.ORANGE);
        turtle.setColor(Color.BLUE);
        turtle2.setShellColor(Color.BLUE);
        turtle.setShellColor(Color.ORANGE);
 
}
}