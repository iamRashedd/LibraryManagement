package menu;

public class menu{
		
		public static void mainMenu(){
				
			System.out.println("\n\t1. Student Management");
			System.out.println("\t2. Teacher Management");
			System.out.println("\t3. Book Management");
			System.out.println("\t4. Borrow/Lost Management");
			System.out.println("\t5. Exit Application");
			System.out.print(">>Option: ");
			
		}
		public static void studentMenu(){
			
			System.out.println("\n\t1. Insert New Student");
			System.out.println("\t2. Remove Existing Student");
			System.out.println("\t3. Show All Students");
			System.out.println("\t4. Go Back");
			System.out.print(">>Option: ");

		}
		public static void teacherMenu(){
			
			System.out.println("\n\t1. Insert New Teacher");
			System.out.println("\t2. Remove Existing Teacher");
			System.out.println("\t3. Show All Teachers");
			System.out.println("\t4. Go Back");
			System.out.print(">>Option: ");
		}
		public static void bookMenu(){
			
			System.out.println("\n\t1. Insert New Book");
			System.out.println("\t2. Remove Existing Book");
			System.out.println("\t3. Show All Books");
			System.out.println("\t4. Go Back");
			System.out.print(">>Option: ");
		}
		public static void borrowMenu(){
			
			System.out.println("\n\t1. Borrow Book");
			System.out.println("\t2. Return Book");
			System.out.println("\t3. Generate Fine");
			System.out.println("\t4. Go Back");
			System.out.print(">>Option: ");
		}
}