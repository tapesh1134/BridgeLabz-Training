package org.tapesh;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.tapesh.service.EmpWageBuilder;
import org.tapesh.model.EmployeeWageBuilder;
import org.tapesh.model.InvalidEmplayeeWageExpection;

import static org.junit.jupiter.api.Assertions.*;

public class EmpWageBuilderTest {

    private EmployeeWageBuilder builder;

    @BeforeEach
    void setUp() {
        builder = new EmpWageBuilder();
    }

    @Test
    void testAddCompany() throws InvalidEmplayeeWageExpection {
        builder.addCompany("TCS", 20, 20, 100);
        builder.computeWage();

        double totalWage = builder.getTotalWage("TCS");

        assertTrue(totalWage >= 0.0);
    }

    @Test
    void testMultipleCompanies() throws InvalidEmplayeeWageExpection{
        builder.addCompany("TCS", 20, 20, 100);
        builder.addCompany("Infosys", 25, 22, 120);

        builder.computeWage();

        double tcsWage = builder.getTotalWage("TCS");
        double infosysWage = builder.getTotalWage("Infosys");

        assertNotEquals(tcsWage, infosysWage);
    }

    @Test
    void testWageIsCalculated() throws InvalidEmplayeeWageExpection{
        builder.addCompany("TestCompany", 10, 5, 40);
        builder.computeWage();

        double wage = builder.getTotalWage("TestCompany");

        assertTrue(wage > 0.0);
    }

    @Test
    void testWageWithinLimit() throws InvalidEmplayeeWageExpection{
        builder.addCompany("LimitTest", 10, 2, 16);
        builder.computeWage();

        double wage = builder.getTotalWage("LimitTest");

        assertTrue(wage <= 160);
    }
}
