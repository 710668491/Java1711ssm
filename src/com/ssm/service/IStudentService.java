package com.ssm.service;

import java.util.List;

import com.ssm.entity.Student;

public interface IStudentService {

	List<Student> findAll();


	void deleteById(Integer id);

	Student findById(Integer id);

}
