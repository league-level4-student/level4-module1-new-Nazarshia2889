package _05_Polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    private int x;
    private int y;
    private int width;
    private int height;
    
    public Polymorph(int x, int y, int width, int height){
   	 this.x = x;
   	 this.y = y;
   	 this.width = width;
   	 this.height = height;
    }
    
    public abstract void update();
    
    public abstract void draw(Graphics g);
    
    public int getX() {
    	return this.x;
    }
    public int getY() {
    	return this.y;
    }
    public void setX(int a) {
    	this.x = a;
    }
    public void setY(int b) {
    	this.y = b;
    }
    
    public int getWidth() {
    	return this.width;
    }
    public int getHeight() {
    	return this.height;
    }
    public void setWidth(int a) {
    	this.width = a;
    }
    public void setHeight(int b) {
    	this.height = b;
    }
}
