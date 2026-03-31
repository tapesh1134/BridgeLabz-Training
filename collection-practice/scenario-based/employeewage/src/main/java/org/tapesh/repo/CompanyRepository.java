package org.tapesh.repo;

import org.tapesh.model.Company;

import java.util.ArrayList;
import java.util.List;

public class CompanyRepository {

    private List<Company> companyList = new ArrayList<>();

    public void addCompany(Company company) {
        companyList.add(company);
    }

    public List<Company> getAllCompanies() {
        return companyList;
    }

    public Company findByName(String name) {
        for (Company company : companyList) {
            if (company.getName().equals(name)) {
                return company;
            }
        }
        return null;
    }
}
