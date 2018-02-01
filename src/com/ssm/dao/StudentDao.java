package com.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ssm.entity.Student;

public interface StudentDao {
	

	List<Student> findAll();

	List<Student> findByName(@Param("tableName")String string, @Param("name")String string2);

	

	Student findById(Integer id);

	Integer deleteById(Integer id);

	

	
}
