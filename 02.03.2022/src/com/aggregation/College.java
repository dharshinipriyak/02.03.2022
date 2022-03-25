package com.aggregation;
import java.io.*;
import java.util.*;

public class College {

	public static void main(String[] args)
	{
		student s1 = new student("Meera", 1, "CSE");
		student s2 = new student("Priya", 2, "CSE");
		student s3 = new student("Ragavi", 1, "ECE");
		student s4 = new student("Jeni", 2, "ECE");
		student s5 = new student("Dhivya", 1, "IT");
		student s6 = new student("Nihara", 2, "IT");

		List<student> cse_students = new ArrayList<student>();
		cse_students.add(s1);
		cse_students.add(s2);

		List<student> ece_students = new ArrayList<student>();
		ece_students.add(s3);
		ece_students.add(s4);
		List<student> it_students = new ArrayList<student>();
		it_students.add(s5);
		it_students.add(s6);

		Department CSE = new Department("CSE", cse_students);
		Department ECE = new Department("ECE", ece_students);
		Department IT = new Department("IT", it_students);

		List<Department> departments = new ArrayList<Department>();
		departments.add(CSE);
		departments.add(ECE);
		departments.add(IT);

		Institute institute = new Institute("BITS", departments);

		System.out.print("Total students in institute: ");
		System.out.print(institute.getTotalStudentsInInstitute());
	}
}
