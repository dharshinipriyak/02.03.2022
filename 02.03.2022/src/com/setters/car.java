package com.setters;
//Using setter
public class car
{
	private int id;
	private String modelname;
	private String color;
	public car() {

	}
	//setter method
	public void setId(int id) {
		this.id = id;
	}
	public void setModelname(String modelname) {
		this.modelname = modelname;
	}
	public void setColor(String color) {
		this.color = color;
	}
	//method
	public void getCarInfo()
	{
		System.out.println(id);
		System.out.println(modelname);
		System.out.println(color);

	}
	public static void main(String[] args) {
		car c1=new car();
		c1.setId(23846);
		c1.setModelname("Jaguar");
		c1.setColor("Black");

	}
}
