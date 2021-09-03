package main;

public class Librarian{
	
	private String name;
	private int LibrarianId;
	private double salary;
	private int age;
	
	public Librarian (){
	}
	public Librarian( String name, int nid, double salary, int age ){
		this.name = name;
		this.LibrarianId = nid;
		this.salary = salary;
		this.salary = salary;
		this.age = age;
	}
	
	public void setName ( String name ){
		this.name = name;
	}
	public void setID ( int nid ){
		this.LibrarianId = nid;
	}
	public void setSalary ( double salary ){
		this.salary = salary;
	}
	public void setAge ( int age ){
		this.age = age;
	}
	public String getName(){
		return this.name;
	}
	public int getID(){
		return this.LibrarianId;
	}
	public double getSalary(){
		return this.salary;
	}
	public int getAge(){
		return this.age;
	}
	
	public void generateFine ( Patron p, double amount ){
		
		double balance = p.getAmount();
		balance += amount;
		p.setAmount ( balance );
		
	}
	
}