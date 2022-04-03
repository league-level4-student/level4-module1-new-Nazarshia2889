package _06_Hospital;

import java.util.ArrayList;

public class Hospital {
	private ArrayList<Doctor> doctors;
	private ArrayList<Patient> patients;
	
	public Hospital() {
		doctors = new ArrayList<Doctor>();
		patients = new ArrayList<Patient>();
	}
	
	public void addDoctor(Doctor d) {
		doctors.add(d);
	}
	
	public void addPatient(Patient p) {
		patients.add(p);
	}
	
	public ArrayList getDoctors() {
		return doctors;
	}
	
	public ArrayList getPatients() {
		return patients;
	}
	
	public void assignPatientsToDoctors() {
		int patientIndex = 0;
		int i = 0;
		while(patientIndex < patients.size()) {
			try {
				doctors.get(i).assignPatient(patients.get(patientIndex));
			}
			catch (DoctorFullException dfe) {
				i++;
				patientIndex--;
			}
			patientIndex++;
		}
	}
		
}
