package main;

public class Book{
	private int id;
	private String title;
	private String subTitle;
	private String authorName;
	private String publisherName;
	private double price;
	private int noOfCopy;
	
	public Book(){
	}
	public Book ( int id, String title, String subTitle, String  authorName, String publisherName, double price, int noOfCopy){
		this.id = id;
		this.title = title;
		this.subTitle = subTitle;
		this.authorName = authorName;
		this.publisherName = publisherName;
		this.price = price;
		this.noOfCopy = noOfCopy;
	}
	public void setId ( int id ){
		this.id = id;
	}
	public void setTitle ( String title ){
		this.title = title;
	}
	public void setSubTitle ( String subTitle ){
		this.subTitle = subTitle;
	}
	public void setAuthor ( String author ){
		this.authorName = author;
	}
	public void setPublisher ( String publisher ){
		this.publisherName = publisher;
	}
	public void setPrice ( double price ){
		this.price = price;
	}
	public void setNoOfCopy ( int noOfCopy ){
		this.noOfCopy = noOfCopy;
	}
	public int getID(){
		return this.id;
	}
	public String getTitle(){
		return this.title;
	}
	public String getAuthorName(){
		return this.authorName;
	}
	public String getPublisherName(){
		return this.publisherName;
	}
	public double getPrice(){
		return this.price;
	}
	public int getNoOfCopy(){
		return this.noOfCopy;
	}
}
