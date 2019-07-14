package com.codenotfound.model.factory;

import com.codenotfound.model.dao.StudentDao;

public abstract class AcademicDaoFactory extends DAOFactory{
	
    public abstract AcademicsDao getAcademicsDao();
    
}


