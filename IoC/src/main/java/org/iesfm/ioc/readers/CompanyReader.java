package org.iesfm.ioc.readers;

import org.iesfm.ioc.Company;

import java.util.Scanner;

public class CompanyReader {


    private Scanner scanner;
    private DepartmentReader departmentReader;

    public CompanyReader(Scanner scanner, DepartmentReader departmentReader) {
        this.scanner = scanner;
        this.departmentReader = departmentReader;
    }


    public Company readCompany()  {
        return null;
    }
}
