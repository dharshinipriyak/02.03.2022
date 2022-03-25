package com.getter;
//Using getter
public class Book {
	private int id;
	private String lname;
	private String author;
	double version;
	public Book() {

	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getVersion() {
		return version;
	}
	public void setVersion(double version) {
		this.version = version;
	}
	public static void main(String[] args) {
		Book book = new Book();
		//setter
		book.setId(4452221);
		book.setLname("Crimes of the Grinderwald");
		book.setAuthor("JK Rowling");
		book.setVersion(2.3);

		//getter
		System.out.println("Book Details");
		System.out.println("Book ID     :"+book.getId());
		System.out.println("Book Name   :"+book.getLname());
		System.out.println("Book Author :"+book.getAuthor());
		System.out.println("Book Version:"+book.getVersion());
	}

}
