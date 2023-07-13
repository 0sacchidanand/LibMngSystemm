package pkg_main;

import java.util.Scanner;

import pkg_book.BookManager;
import pkg_exception.StudentNotFoundException;
import pkg_person.Student;
import pkg_person.StudentManager;
import pkg_transaction.BookTransactionManager;

public class Main {

	public static void main(String[] args) {
		int choice;
		
		Scanner sc = new Scanner(System.in);
		
		BookManager bm = new BookManager();
		StudentManager sm = new StudentManager();
		BookTransactionManager btm = new BookTransactionManager();
		
		do {
			System.out.println("Entern 1 if Student\nEnter 2 if Librarian\nEnter 3 if want to Exit:");
			choice = sc.nextInt();
			
			if(choice ==1) //if user is student
			{
				System.out.println("Enter your Roll Number");
				int rollNo = sc.nextInt();
				try {
					Student s = sm.get(rollNo);
					if(s == null)
						throw new StudentNotFoundException();
					int stud_choice;
					do {
						System.out.println("Enter 1 to View All Book\nEnter 2 to search book by ISBN\nEnter 3 to List Books By Subject\nEnter 4 to issue a Book\nEnter 5 to return a Book\nEnter 99 to Exit");
						stud_choice = sc.nextInt();
						switch(stud_choice) {
						case 1:
							System.out.println("View All Selected");
							break;
						case 2:
							System.out.println("Search By ISBN Selected");
							break;
						case 3:
							System.out.println("Search By Subject");
							break;
						case 4:
							System.out.println("Issual of Book");
							break;
						case 5:
							System.out.println("Return of Book");
							break;
						case 99:
							System.out.println("Thank you for Using Library");
							break;
							default:
								System.out.println("Invalid Choice");
								break;
						}
						
					}while(stud_choice !=99);
				}
				catch(StudentNotFoundException e) {
					System.out.println(e);
				}
				}
		}while(choice != 3);
	}

}
