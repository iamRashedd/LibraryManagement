package menu;

import interfaces.IBasicOperations;
import interfaces.IBookOperations;
import main.*;
import java.util.Scanner;

class borrowManagement{
	
	private byte option;
	Scanner scan = new Scanner ( System.in );
	Library Lb = new Library();
	IBasicOperations b = Lb;
	IBookOperations bk = Lb;
	Patron p;
	Book temp;
	int id;
	
	public borrowManagement(){
		
		do{
			menu.borrowMenu();
			option = scan.nextByte();
			scan.skip( "\\R" );
			System.out.println ();
			
			if ( option > 0 && option < 4){
				System.out.print ( "Enter Patron ID: ");
				String id = scan.nextLine().trim();
				p = getPatron( id );
				if ( p == null ){
					System.out.println ( "Patron not Found" );
					option = 10;
				}
			}
			switch( option ){
				
				case 1:
					bk.showAllBooks();
					System.out.print ( "\n>>Enter Book id to borrow: " );
					id = scan.nextInt();
					temp = bk.getBook ( id );
					if ( temp != null ){
						b.borrowBook ( p, temp);
					}
					else
						System.out.println ( "Book not Found" );
					break;
				
				case 2:
					bk.showAllBooks();
					System.out.print ( "\n>>Enter Book id to return: " );
					id = scan.nextInt();
					temp = bk.getBook ( id );
					if ( temp != null ){
						b.returnBook ( p, temp);
					}
					else
						System.out.println ( "Book not Found" );
					break;
				
				case 3:
					System.out.print ( "Enter amount to fine: " );
					double amount = scan.nextDouble();
					b.fine ( p , amount );
					break;
			
				case 4:
					break;
				
				default:
					System.out.println ( "##INVALID INPUT" );
			}
		}while( option!=4 );
	}
	
	private Patron getPatron ( String id ){
		
		for ( int i=0; i<10; i++ ){
			
			if ( Lb.teachers[i] != null && Lb.teachers[i].getTeacherId().compareTo ( id ) == 0 ){
				return Lb.teachers[i];
			}
			else if ( Lb.students[i] !=null && Lb.students[i].getStudentId().compareTo ( id ) == 0 ){
				return Lb.students[i];
			}
			
		}
		
		return null;
	}
}