package menu;
import interfaces.ITeacherOperations;
import main.Teacher;
import main.Library;
import java.util.Scanner;

class teacherManagement{
	
	private byte option;
	Scanner scan = new Scanner ( System.in );
	ITeacherOperations t = new Library();
	
	public teacherManagement(){
		
		do{
			menu.teacherMenu();
			option = scan.nextByte();
			scan.skip ( "\\R" );
			System.out.println ();
			
			switch( option ){
				
				case 1:
					t.insertTeacher( newTeacher() );
					break;
				
				case 2:
					System.out.print ( "\n>>Enter Teacher id to remove: " );
					String teacherId = scan.nextLine();
					Teacher temp = t.getTeacher( teacherId );
					if ( temp != null )
						t.removeTeacher( temp );
					else
						System.out.println ( "\nTeacher not Found" );
					break;
				
				case 3:
					t.showAllTeachers();
					break;
				
				case 4:
					break;
				
				default:
					System.out.println ( "##INVALID INPUT" );
			}
		}while( option!=4 );
	}
	
	private Teacher newTeacher (){
		
		System.out.print ( "Enter Teacher ID: " );
		int id = scan.nextInt();
		scan.skip ( "\\R");
		System.out.print ( "Enter Teacher Name: " );
		String name = scan.nextLine().trim();
		System.out.print ( "Enter Teacher Department Name: " );
		String depart = scan.nextLine().trim();
		System.out.print ( "Enter Teacher email: " );
		String mail = scan.nextLine().trim();
		System.out.print ( "Enter Teacher Contact No: " );
		String contact = scan.nextLine().trim();
		System.out.print ( "Enter Teacher Address: " );
		String address = scan.nextLine().trim();
		
		Teacher tcr = new Teacher( id, name, depart, mail, contact, address );
		return tcr;
	}
}