package org.tapesh.service;

import org.tapesh.dao.PatientDAO;
import org.tapesh.model.Patient;

public class PatientService {

    private final PatientDAO patientDAO = new PatientDAO();

    public int registerPatient(Patient patient) throws Exception {

        if (patientDAO.existsByPhoneOrEmail(
                patient.getPhone(), patient.getEmail())) {
            throw new RuntimeException("Patient already exists");
        }

        return patientDAO.save(patient);
    }
}
