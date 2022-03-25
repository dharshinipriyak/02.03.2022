package com.setterAndToStringMethod;

public class Mobile
{
	private int id;
	private String name, RAM, color;
	private double launchingdate;
	public Mobile() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRAM() {
		return RAM;
	}
	public void setRAM(String rAM) {
		RAM = rAM;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getLaunchingdate() {
		return launchingdate;
	}
	public void setLaunchingdate(double launchingdate) {
		this.launchingdate = launchingdate;
	}
	//ToStringMethod
	public String toString()
	{
		return "Mobile [Id= "+id+",Name= "+name+", RAM "+RAM+",Color "
	    +color+",Launching Date "+launchingdate+"]";
	}
	public static void main(String[] args) {
		Mobile mbl=new Mobile();
		mbl.setId(9895);
		mbl.setName("OnePlus Foldable");
		mbl.setRAM("12Gb");
		mbl.setColor("White");
		mbl.setLaunchingdate(03.2022);
		System.out.println(mbl.toString());
		}
}
