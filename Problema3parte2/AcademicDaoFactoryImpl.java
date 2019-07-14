package com.codenotfound.model.factory;

import com.codenotfound.model.dao.StudentDao;
import com.codenotfound.model.dao.StudentDaoImpl;

public class AcademicDaoFactoryImpl extends AcademicDaoFactory {
    //public static final String DATASOURCE = "jdbc/ruda_masindivDS";

    @Override
    public AcademicsDao getAcademicsDao(){
    	return new AcademicsDaoImpl();
    }


}