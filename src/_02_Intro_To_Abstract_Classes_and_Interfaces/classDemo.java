package _02_Intro_To_Abstract_Classes_and_Interfaces;

public class classDemo extends AbstractClassDemo implements InterfaceDemo, DemoInterface{
	public void abstractDemo() {
		System.out.println("Hello");
	}
	
	public int abstractNumDemo() {
		return 2;
	}
	
	public double interDemo() {
		return 2.4;
	}
	
	public String faceDemo() {
		return "Hello";
	}

}
