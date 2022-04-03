package _06_Hospital;

import java.util.ArrayList;

public abstract class Doctor {
	private boolean medicine;
	private ArrayList<Patient> patients;
	
	public Doctor() {
		medicine = false;
		patients = new ArrayList<Patient>();
	}
	
	public void doMedicine() {
		for(int i = 0;i<patients.size();i++) {
			patients.get(i).cared = true;
		}
	}
	
	public void assignPatient(Patient p) throws DoctorFullException {
		if(patients.size() == 3) {
			throw new DoctorFullException();
		}
		else {
			patients.add(p);
		}
	}
	
	public ArrayList getPatients() {
		return patients;
	}
	
	
}
