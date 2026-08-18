import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

public class Main {
  public static void main(String[] args) {  
    World world = new World(800, 700);
   
     
		Turtle t1 = new Turtle(200, 300, world);
		Turtle t2 = new Turtle(300, 500, world);

		t1.setPenWidth(10);

		t1.asterisk(6, 60);

		t2.setPenWidth(5);
		t2.star(5, 90);


		Turtle t3 = new Turtle(500, 400, world);
		t3.pinwheel(5, 50);
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
