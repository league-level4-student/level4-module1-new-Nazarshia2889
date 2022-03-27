package _06_Hospital;

import java.util.ArrayList;

public abstract class Doctor {
	private boolean medicine;
	private ArrayList<Patient> patients;
	
	public Doctor() {
		medicine = false;
		patients = new ArrayList<Patient>();
	}
	
	public boolean doMedicine() {
		medicine = true;
		return medicine;
	}
	
	public void assignPatient(Patient p) {
		patients.add(p);
	}
	
	public ArrayList getPatients() {
		return patients;
	}
	
	
}
