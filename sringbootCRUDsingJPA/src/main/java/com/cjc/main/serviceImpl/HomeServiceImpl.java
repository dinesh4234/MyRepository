package com.cjc.main.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Student;
import com.cjc.main.repository.HomeRepository;
import com.cjc.main.service.HomeService;
@Service
public class HomeServiceImpl implements HomeService
{
	
	   @Autowired 
	 private HomeRepository hr;

	@Override
	public void saveData(Student s) {
	 hr.save(s);
		
	}

	//@Override
	public Student logincheck(String un, String ps) {
		
		
				Student s=hr.findByUnameAndPass(un, ps);
				return s;
	}

	@Override
	public Iterable<Student> getAllData() 
	{
		return  hr.findAll();
	}

	@Override
	public void deletedata(Student s) {
	
		hr.delete(s);
		
	}

	@Override
	public Student editdata(int id) 
	{
		Student s=hr.findById(id);
		return s;	
	}

	@Override
	public Student mobileno(int mobileno) {
	
		
		
		return null;
	}

}
