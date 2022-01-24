package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class MovingMorph extends Polymorph {

	public MovingMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		Random rand = new Random();
		setX(rand.nextInt(500));
		setY(rand.nextInt(500));
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.black);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}

}
