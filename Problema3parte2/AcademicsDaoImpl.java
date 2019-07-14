package com.codenotfound.model.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.codenotfound.model.Student;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component("repositoryA")
public class AcademicsDaoImpl implements AcademicsDao {

    @Override
    public List findAll() {
        List<Academics> list = new ArrayList<Academics>();
        Academics academics = null;
        String data = this.readFile();
        for (String nombreAcademic : data.split(";")) {
            academics = new Academics();
            academics.setNombre(nombreAcademic.trim());
            list.add(academic);
        }
        return list;
    }

    private String readFile()  {
        String data = "";
        try {
            FileInputStream fis = new FileInputStream("data/academics.txt");
            data = IOUtils.toString(fis, "UTF-8");
            System.out.println(data);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
    
}