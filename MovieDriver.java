import java.util.Scanner;

public class MovieDriver extends Movie{

	public static void main(String[] args) {
		
		String ss1 = new String("y");
		
		do {
			Scanner sc = new Scanner(System.in);
			Movie mv = new Movie();
			
			//Set Movie Name from user input
			System.out.println("Enter movie title: ");
			String mName = sc.nextLine();
			mv.setTitle(mName);
			
			//Set movie rating from user input
			System.out.println("Enter movie rating: ");
			String mRating = sc.nextLine();
			mv.setRating(mRating);
			
			//set number of tickets sold for the movie
			System.out.println("Enter the number of tickets sold for this movie: ");
			int tickets = sc.nextInt();
			mv.setSoldTickets(tickets);
			
			//Print out results 
			System.out.println(mv.toString());
			
			System.out.println("Do you want to enter another? (y or n?)");
		    ss1 = sc.next();
			
			
			
		}while (ss1.equalsIgnoreCase("y"));
		System.out.println("Goodbye");
		

	}

}
