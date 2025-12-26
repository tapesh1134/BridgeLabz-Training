import java.util.*;

class Patient {
	String name;
	List<Doctor> doctors = new ArrayList<>();

	public Patient(String name) {
		this.name = name;
	}
}

class Doctor {
	String name;
	List<Patient> patients = new ArrayList<>();

	public Doctor(String name) {
		this.name = name;
	}

	public void consult(Patient p) {
		patients.add(p);
		p.doctors.add(this);
		System.out.println(name + " is consulting patient " + p.name);
	}
}

public class Hospital {
	List<Doctor> doctors = new ArrayList<>();
	List<Patient> patients = new ArrayList<>();

	public void addDoctor(Doctor d) {
		doctors.add(d);
	}

	public void addPatient(Patient p) {
		patients.add(p);
	}

	public static void main(String[] args) {
		Hospital hospital = new Hospital();
		Doctor d1 = new Doctor("Dr. Raj");
		Doctor d2 = new Doctor("Dr. Verma");
		Patient p1 = new Patient("Aman");
		Patient p2 = new Patient("Riya");
		hospital.addDoctor(d1);
		hospital.addDoctor(d2);
		hospital.addPatient(p1);
		hospital.addPatient(p2);

		d1.consult(p1);
		d1.consult(p2);
		d2.consult(p1);
	}
}
