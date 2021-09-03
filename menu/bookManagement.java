package menu;

import interfaces.IBookOperations;
import main.Book;
import main.Library;
import java.util.Scanner;

public class bookManagement{
	
	private byte option;
	Scanner scan = new Scanner ( System.in );
	IBookOperations b = new Library();
	
	public bookManagement(){
		
		do{
			menu.bookMenu();
			option = scan.nextByte();
			scan.skip ( "\\R" );
			System.out.println ();
			
			switch( option ){
				
				case 1:
					b.insertBook( newBook() );
					break;
				
				case 2:
					System.out.print ( "\n>>Enter Book id to remove: " );
					int id = scan.nextInt();
					Book temp = b.getBook ( id );
					if ( temp != null )
						b.removeBook( temp );
					else
						System.out.println ( "Book not Found" );
					break;
				
				case 3:
					b.showAllBooks();
					break;
				
				case 4:
					break;
				
				default:
					System.out.println ( "##INVALID INPUT" );
			}
		}while( option!=4 );
	}
	
	private Book newBook (){
		
		System.out.print ( "Enter Book ID: " );
		int id = scan.nextInt();
		scan.skip ( "\\R");
		System.out.print ( "Enter Book Tittle: " );
		String tittle = scan.nextLine().trim();
		System.out.print ( "Enter Book SubTittle: " );
		String subTittle = scan.nextLine().trim();
		System.out.print ( "Enter Book Author Name: " );
		String author = scan.nextLine().trim();
		System.out.print ( "Enter Book Publisher Name: " );
		String publisher = scan.nextLine();
		System.out.print ( "Enter Book Price: " );
		double price = scan.nextDouble();
		System.out.print ( "Enter No of copy: " );
		int noOfCopy = scan.nextInt();
		
		Book bk = new Book( id, tittle, subTittle, author, publisher, price ,noOfCopy );
		return bk;
	}
	
}