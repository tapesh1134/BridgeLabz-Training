package org.tapesh.dao;

import org.tapesh.model.Patient;
import org.tapesh.util.DatabaseUtil;

import java.sql.*;

public class PatientDAO {

    public boolean existsByPhoneOrEmail(String phone, String email) throws Exception {
        String sql = "SELECT 1 FROM patients WHERE phone = ? OR email = ?";

        try (Connection con = DatabaseUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, phone);
            ps.setString(2, email);
            return ps.executeQuery().next();
        }
    }

    public int save(Patient patient) throws Exception {
        String sql = "INSERT INTO patients (name, dob, phone, email, address, blood_group) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection con = DatabaseUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(
                     sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setString(1, patient.getName());
            ps.setDate(2, Date.valueOf(patient.getDob()));
            ps.setString(3, patient.getPhone());
            ps.setString(4, patient.getEmail());
            ps.setString(5, patient.getAddress());
            ps.setString(6, patient.getBloodGroup());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            return rs.next() ? rs.getInt(1) : -1;
        }
    }
}
