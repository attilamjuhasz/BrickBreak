package com.BrickBreak;

import java.awt.Graphics;
import java.awt.*;

public class Paddle {


	//your code here!


	
	//don't forget you need instance variables:
	private int x;
	private int y;
	private int velocity;
	private int width;
	private int height;
	
	//constructor(s):
	public Paddle(int x, int y, int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	//methods:

//
//  Pre-condition: x, velocity, width, and height must be defined for the object
//  Post-condition: Draws the object
//
	public void draw(Graphics g){
			g.setColor(Color.white);
			g.fill3DRect(x, velocity, width, height, false);
		}


//
//  Pre-condition: Velocity must be defined
//  Post-condition: Return int velocity
//
	public int getVelocity(){
		return velocity;
	}

//
//  Pre-condition: Velocity must be defined 
//  Post-condition: Adds velocity to x, in turn, making it move
//
	public void move(){
		x += velocity;
	}

//
//  Pre-condition: A paddle object must be created
//  Post-condition: Velocity will be greated by the given value
//
	public void addVelocity(int velocity){
		this.velocity +=velocity;
	}

//
//  Pre-condition: A paddle object must be created
//  Post-condition: X coordinate will be eqaul to the given value
//
	public void setX(int x){
		this.x = x;
	}

//
//  Pre-condition: A paddle object must be created
//  Post-condition: Y coordinate will be eqaul to the given value
//
	public void setY(int y){
		this.y = y;
	}
	
	
}
