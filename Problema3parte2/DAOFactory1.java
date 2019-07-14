package com.codenotfound.model.factory;




public abstract class DAOFactory1 {
    public static final int ACADEMIC_REPOSITORY = 1;

    public static DAOFactory1 getDAOFactory1(int tipo) {
        switch (tipo) {
	        case ACADEMIC_REPOSITORY:
	            return new AcademicDaoFactoryImpl();            
	        default:
	            return null;
        }
    }


    

}