package com.cjc.main.service;

import com.cjc.main.model.Student;

public interface HomeService 
{

	public void saveData(Student s);
	public Student logincheck(String un,String ps);
	public Iterable<Student> getAllData();
	public void deletedata(Student s);
	public Student editdata(int id);
	public Student mobileno(int mobileno);
    
}
