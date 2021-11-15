package org.iesfm.ioc.readers;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.iesfm.ioc.Company;

import java.io.File;
import java.io.IOException;

public class CompanyFileReader {

    private String filePath;

    private ObjectMapper objectMapper;

    public Company readCompany() throws IOException {
        return objectMapper.readValue(new File(filePath), Company.class);
    }
}
