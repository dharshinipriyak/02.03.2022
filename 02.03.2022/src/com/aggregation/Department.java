package com.aggregation;
import java.util.*;

public class Department {
	String name;

	private List<student> students;
	Department(String name, List<student> students)
	{

		this.name = name;
		this.students = students;
	}
	public List<student> getStudents()
	{
		return students;
	}
}
