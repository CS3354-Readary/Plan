package Readary.Readary;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	
    	String genre, author, book;
    	genre ="";
    	author ="";
    	book ="";
    	userInput(genre, author, book);
    }
    

	public static void userInput(String userGenre, String userAuth, String userBook) {

		Scanner input = new Scanner(System.in);
		do {
		System.out.println("What is your favorite genre? If you can't decide, choose one of your favorite genres.");
		userGenre = input.nextLine();
		if(userGenre.matches("[0-9]+")) {
			System.out.println("Please enter a genre with no numbers.");
			}
		if(userGenre.isEmpty()) {
			System.out.println("Please enter something.");
			}
		}	
		while (userGenre.matches("[0-9]+") || userGenre.isEmpty());
		
		do {
		System.out.println("Who's your favorite author?");
		userAuth = input.nextLine();
		
		if(userAuth.matches("[0-9]+")) {
			System.out.println("Please enter an author with no numbers.");
			}
		
		if(userAuth.isEmpty()) {
			System.out.println("Please enter something.");
			}
		}
		while (userAuth.matches("[0-9]+") || userAuth.isEmpty());
		
		do{
		System.out.println("What's your favorite book?");
		userBook = input.nextLine();
		if(userBook.isEmpty()) {
			System.out.println("Please enter something.");
			}
		}
		while(userBook.isEmpty());
		System.out.println("Thank you for entering! We are processing your preferences now.");
		
		input.close();
	}
}
