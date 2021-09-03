package interfaces;
import main.Patron;
import main.Book;

public interface IBasicOperations{
	
	void borrowBook ( Patron p, Book b );
	void returnBook ( Patron p, Book b );
	void fine ( Patron p, double amount );
	
}
	