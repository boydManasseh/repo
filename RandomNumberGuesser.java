import java.util.Random;
import java.util.Scanner;
public class RandomNumberGuesser extends Student{

	public static void main(String[] args) {


		System.out.println("----------Random Number Guesser-----------");
		String st1 = new String("no");
		String st2;
		do {
			int nextGuess=0,lowGuess,highGuess,randomNumber;
			Student a1 = new Student();
			lowGuess = a1.getlGuess();
			highGuess = a1.gethGuess();
			Random r1 = new Random();
			Scanner scan = new Scanner(System.in);


			randomNumber = r1.nextInt(highGuess);
			a1.setrNum(randomNumber);
			System.out.println("Enter first Guess: ");
			nextGuess = scan.nextInt();
			a1.setnGuess(nextGuess);

			while ((a1.nGuess < lowGuess) || (a1.nGuess > highGuess)) {
				System.out.println("Please enter a number between 0 and 100: ");
				nextGuess = scan.nextInt();
				a1.setnGuess(nextGuess);
			}

			while (a1.nGuess != a1.rNum) {
				if (a1.nGuess > a1.rNum) {
					highGuess = a1.nGuess;
					System.out.println("Your guess is too high. Try again: ");

				}else {
					lowGuess = a1.nGuess;
					System.out.println("Your guess is too low. Try again: ");
				}	
				System.out.println("Enter Your next guess between "+ lowGuess +" and "+highGuess);
				nextGuess = scan.nextInt();
				a1.setnGuess(nextGuess);
				while ((a1.nGuess < lowGuess) || (a1.nGuess > highGuess)) {
					System.out.println("Please enter a number between "+ lowGuess +" and "+ highGuess +": ");
					nextGuess = scan.nextInt();
					a1.setnGuess(nextGuess);
				}

			}
			System.out.println("Congratulations! You guessed correct.");	

			System.out.println("Try again? (yes/no)");
			st2 = scan.next();

		}while(!(st2.equals(st1)));


		System.out.println("Thank you for playing... ");

	}

}


