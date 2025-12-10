// Attila M Juhasz
// Code

package com.BrickBreak;
import java.awt.*;

public class Ball {
	//your code here!
	
	//don't forget you need instance variables:
	private int x;
	private int y;
	private int radius;
	private int xVelocity;
	private int yVelocity;
	
	
	
	//constructor(s):
	public Ball(int x, int y, int diameter){
		this.x = x;
		this.y = y;
		this.radius = radius*2;
	}
	
	//methods:

//
//  Pre-condition: x, y, and radius must be defined for the object
//  Post-condition: Draws the object
//
	public void draw(Graphics g){
		g.setColor(Color.white);
		g.fillOval(x, y, radius*2, radius*2);
	}

//
//  Pre-condition: y must be defined
//  Post-condition: Returns int y
//

	public int getYpos(){
		return this.y;
	}

//
//  Pre-condition: x must be defined
//  Post-condition: returns int x
//
	public int getXpos(){
		return this.x;
	}

//
//  Pre-condition: radius must be defined
//  Post-condition: returns int radius
//
	public int getSize(){
		return radius;
	}

//
//  Pre-condition: yVelocity must be defined
//  Post-condition: Multiplies the yVelocity of the class by one, reversing it
//
	public void reverseY(){
		yVelocity = yVelocity*(-1);
	}

//
//  Pre-condition: xVelocity must be defined
//  Post-condition: Multiplies the xVelocity of the class by one, reversing it
//
	public void reverseX(){
		xVelocity = xVelocity*(-1);
	}

//
//  Pre-condition: A ball object but be created
//  Post-condition: Set the x coordinate to the given value
//
	public void setX(int x){
		this.x = x;
	}

//
//  Pre-condition: A ball object but be created
//  Post-condition: Set the y coordinate to the given value
//
	public void setY(int y){
		this.y = y;
	}

//
//  Pre-condition: A ball object but be created
//  Post-condition: Set the xVelocity to the given value
//
	public void setXVelocity(int xVelocity){
		this.xVelocity = xVelocity;
	}

//
//  Pre-condition: A ball object but be created
//  Post-condition: Set the yVelocity to the given value
//
	public void setYVelocity(int yVelocity){
		this.yVelocity = yVelocity;
	}

//
//  Pre-condition: A ball object but be created
//  Post-condition: Sets the yVelocity and xVelocity to 1
//
	public void move(){
		xVelocity = 1;
		yVelocity = 1;
	}


}
