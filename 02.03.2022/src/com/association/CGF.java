package com.association;
import java.io.*;
import java.util.*;

public class CGF 
{
	public static void main (String[] args) {
		Bank bank=new Bank("ICICI");
		Employee emp=new Employee ("Ridhi");
		System.out.println(emp.getEmployeeName()+" is Employee of "+bank.getbankName());
		}

}
