package com.company.bo;

import java.util.List;

import com.company.dao.DemoDao;
import com.company.model.Student;

public class DemoBo {
	 
	DemoDao dd = new DemoDao();
	 
    /**
     * create database and initialize the 
     */
	public void initDB(){
		dd.initializeDB();
	}
	
	public int insertStudent(Student s ){
		return dd.insertStudent(s);
	}

	public List<Student> selectStudent(){
		return dd.selectStudent();
		
	}
	public int deleteStudent(int id){
		return dd.delStudent(id);
	}
}
