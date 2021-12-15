package org.iesfm.ioc;

import org.iesfm.ioc.readers.CompanyReader;

import java.util.Scanner;

public class Menu {

    private String mensaje;
    private Scanner scanner;
    private CompanyReader companyReader;


    public Menu(String mensaje, Scanner scanner, CompanyReader companyReader) {
        this.mensaje = mensaje;
        this.scanner = scanner;
        this.companyReader = companyReader;
    }

    public void run() {
        System.out.println(mensaje);

        Company company = companyReader.readCompany();
    }
}
