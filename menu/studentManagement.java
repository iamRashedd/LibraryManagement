package menu;
import interfaces.IStudentOperations;
import main.Student;
import main.Library;
import java.util.Scanner;

public class studentManagement{
	
	private byte option;
	Scanner scan = new Scanner ( System.in );
	IStudentOperations s = new Library();
	
	public studentManagement(){
		
		do{
			menu.studentMenu();
			option = scan.nextByte();
			scan.skip ( "\\R" );
			System.out.println ();
			
			switch( option ){
				
				case 1:
					s.insertStudent( newStudent() );
					break;
				
				case 2:
					System.out.print ( "\n>>Enter Student id to remove: " );
					String studentId = scan.nextLine().trim();
					Student temp = s.getStudent ( studentId );
					if ( temp != null )
						s.removeStudent( temp );
					else
						System.out.println ( "\nStudent not Found" );
					break;
				
				case 3:
					s.showAllStudents();
					break;
				
				case 4:
					break;
				
				default:
					System.out.println ( "##INVALID INPUT" );
			}
		}while( option!=4 );
	}
	
	private Student newStudent (){
		
		System.out.print ( "Enter Student ID: " );
		int id = scan.nextInt();
		scan.skip ( "\\R");
		System.out.print ( "Enter Student Name: " );
		String name = scan.nextLine().trim();
		System.out.print ( "Enter Student Department Name: " );
		String depart = scan.nextLine().trim();
		System.out.print ( "Enter Student email: " );
		String mail = scan.nextLine().trim();
		System.out.print ( "Enter Student Contact No: " );
		String contact = scan.nextLine().trim();
		System.out.print ( "Enter Student Address: " );
		String address = scan.nextLine().trim();
		System.out.print ( "Enter Student Guardian Name: " );
		String gName = scan.nextLine().trim();
		System.out.print ( "Enter Student Guardian Contact No: " );
		String gContact = scan.nextLine().trim();
		
		Student st = new Student( id, name, depart, mail, contact, address, gName, gContact );
		return st;
	}
	
}