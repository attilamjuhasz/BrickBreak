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

	public void draw(Graphics g){
		g.setColor(Color.white);
		g.fillOval(x, y, radius*2, radius*2);
	}
	
	public int getYpos(){
		return this.y;
	}
	public int getXpos(){
		return this.x;
	}
	public int getSize(){
		return radius;
	}
	public void reverseY(){
		yVelocity = yVelocity*(-1);
	}
	public void reverseX(){
		xVelocity = xVelocity*(-1);
	}
	public void setX(int x){
		this.x = (this.x)*x;
	}
	public void setY(int y){
		this.y = y;
	}
	public void setXVelocity(int xVelocity){
		this.xVelocity = xVelocity;
	}
	public void setYVelocity(int yVelocity){
		this.yVelocity = yVelocity;
	}
	public void move(){
		xVelocity = 1;
		yVelocity = 1;
	}


}
