import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

public class Main {
  public static void main(String[] args) {  
    World world = new World(800, 700);
   
     
		Turtle t1 = new Turtle(200, 300, world);
		Turtle t2 = new Turtle(300, 500, world);
		t1.setPenColor(Color.red);
		t1.setPenWidth(10);

		t1.setName("Galapagos tortoise");

		t1.asterisk(6, 60);

		t2.setPenColor(Color.blue);
		t2.setName("Midland painted turtle");
		t2.setPenWidth(5);
		t2.star(5, 90);


		Turtle t3 = new Turtle(500, 400, world);
		t3.setPenColor(Color.magenta);
		t3.setName("Leatherback sea turtle");
		t3.setPenWidth(2);
		t3.pinwheel(5, 50);

		Turtle t4 = new Turtle(400, 200, world);
		t4.setName("Hawksbill turtle");
		t4.setPenColor(Color.green);
		t4.setPenWidth(7);
		t4.circle(50, 15, 0.75);

		System.out.println(t1.getName() + " with color " + t1.getPenColor().toString() + " at position " + t1.getXPos() + ", " + t1.getYPos() + " and asterisk shape");
		System.out.println(t2.getName() + " with color " + t2.getPenColor().toString() + " at position " + t2.getXPos() + ", " + t2.getYPos() + " and 5-point star shape");
		System.out.println(t3.getName() + " with color " + t3.getPenColor().toString() + " at position " + t3.getXPos() + ", " + t3.getYPos() + " and 5-repeat pentagonal shape");
		System.out.println(t4.getName() + " with color " + t4.getPenColor().toString() + " at position " + t4.getXPos() + ", " + t4.getYPos() + " and 75% of circle shape");
    // Turtle yertle = new Turtle(world);
    // // Add your code here
    // yertle.forward();
    // yertle.turnRight();
    // yertle.forward();

  
    world.setVisible(true);

    // World world2 = new World(true);
   
     
    // Turtle yertle2 = new Turtle(world2);
    // // Add your code here
    // yertle2.forward();
    // yertle2.turnRight();
    // yertle2.forward();

  
    //world.setVisible(true);
  }
}
