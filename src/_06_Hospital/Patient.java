package _06_Hospital;

public class Patient {
	public boolean cared;
	
	public Patient() {
		cared = false;
	}
	
	public boolean feelsCaredFor() {
		return cared;
	}
	
	public void checkPulse() {
		cared = true;
	}
}
