package org.iesfm.ioc;

import org.iesfm.ioc.readers.CompanyReader;
import org.iesfm.ioc.readers.DepartmentReader;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Scanner;

@Configuration
@PropertySource("application.properties")
public class CompanyConfiguration {

    @Bean
    public CompanyReader companyReader(Scanner scanner, DepartmentReader departmentReader) {
        return new CompanyReader(scanner, departmentReader);
    }

    @Bean
    public Scanner scanner(){
        return new Scanner(System.in);
    }

    @Bean
    public Menu menu(
            @Value("${mensaje.bienvenida}") String mensaje,
            Scanner scanner,
            CompanyReader companyReader
    ){
        return new Menu(mensaje, scanner, companyReader);
    }
}
