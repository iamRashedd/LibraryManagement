package main;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class file{
	
	private static String path = System.getProperty ( "user.dir" ) + "/data/";
	
	public static void saveFile ( Patron p, Book b , String work){
		try{
			File history = new File ( path + "History.txt" );
			
			if( !history.exists() ){
				history.createNewFile();
				FileWriter file = new FileWriter( history );
				file.write ( "Patron name: " + p.getName() + "\n" );
				file.write ( "Patron ID    : " + p.getId() + "\n" );
				file.write ( work + b.getTitle() + "(" + b.getID() + ")" +"\n" );
				file.write ( "\n" );
				file.close();
			}
			else{
				File newFile = new File ( "temp.txt" );
				FileWriter file = new FileWriter ( newFile );
				Scanner scanf = new Scanner ( history );
				String line;
				while( scanf.hasNextLine() )
				{
					line = scanf.nextLine();
					file.write( line + "\n" );
				}
				file.write ( "Patron name: " + p.getName() + "\n" );
				file.write ( "Patron ID    : " + p.getId() + "\n" );
				file.write ( work + b.getTitle() + "(" + b.getID() + ")" +"\n" );
				file.write ( "\n" );
				
				scanf.close();
				file.close();
				history.delete();
				File temp = new File( path + "History.txt");
				newFile.renameTo(temp);
			}
			
			
		}
		catch ( IOException e ){
			System.out.println ( "An error occured" );
			e.printStackTrace();
		}
	}
	
	public static void showDetails ( ){
		try{
			boolean isEmpty = true;
			File history = new File ( path + "History.txt" );
			if ( history.exists() ){
				Scanner scanf = new Scanner ( history );
				String line;
				while( scanf.hasNextLine() ){
					line = scanf.nextLine();
					System.out.println ( line );
					isEmpty = false;
				}
				scanf.close();
				if ( isEmpty )
					System.out.println ( "File is Empty" );
			}
			else
				System.out.println ( "File not found" );
		}
		catch ( IOException e ){
			System.out.println ( "An error occured" );
			e.printStackTrace();
		}
	}
}