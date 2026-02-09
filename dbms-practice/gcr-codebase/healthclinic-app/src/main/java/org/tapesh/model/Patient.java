package org.tapesh.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Patient {
    private int id;
    private String name;
    private LocalDate dob;
    private String phone;
    private String email;
    private String address;
    private String bloodGroup;
}
