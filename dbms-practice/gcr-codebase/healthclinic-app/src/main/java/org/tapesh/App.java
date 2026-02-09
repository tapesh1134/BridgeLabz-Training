package org.tapesh;

import org.tapesh.model.Patient;
import org.tapesh.service.PatientService;

import java.time.LocalDate;

public class App 
{
    public static void main( String[] args ) throws Exception {

        Patient patient = new Patient();
        patient.setName("Rahul Sharma");
        patient.setDob(LocalDate.of(2001, 5, 10));
        patient.setPhone("9876543210");
        patient.setEmail("rahul@gmail.com");
        patient.setAddress("Delhi");
        patient.setBloodGroup("O+");

        PatientService patientService = new PatientService();
        int patientId = patientService.registerPatient(patient);

        System.out.println("Patient registered successfully. ID = " + patientId);

    }
}
