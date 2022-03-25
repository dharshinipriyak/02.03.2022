package com.aggregation;
import java.io.*;
import java.util.*;

public class Institute {

	String instituteName;
	private List<Department> departments;

	Institute(String instituteName,List<Department> departments)
	{

		this.instituteName = instituteName;
		this.departments = departments;
	}

	public int getTotalStudentsInInstitute()
	{
		int noOfStudents = 0;
		List<student> students;

		for (Department dept : departments) {
			students = dept.getStudents();

			for (student s : students) {
				noOfStudents++;
			}
		}

		return noOfStudents;
	}
}

