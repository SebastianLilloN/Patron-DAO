package com.codenotfound.services;

import java.util.List;

import javax.inject.Named;

import com.codenotfound.model.Student;
import com.codenotfound.model.factory.DAOFactory;
import com.codenotfound.model.factory.StudentDaoFactory;


@Named
public class AcademicsService {
	
	private AcademicDaoFactory academicDaoFactory ;
	
	
	public StudentService() {
		this.academicDaoFactory = (AcademicDaoFactory)DAOFactory1.getDAOFactory1(DAOFactory1.ACADEMIC_REPOSITORY);
	}
	

    public List<Academics> getAcademicsList() {
        return this.academicDaoFactory.getacademicDao().findAll();
    }
    

}