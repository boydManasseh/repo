/*
 * Class: CMSC203 
 * Instructor: Professor Ahmed Tarek
 * Description: This is a program that diagnoses WiFi connectivity failure and provides fixes to some of the possible causes of the problem.
 * Due: 9/14/2021
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Boyd Manasseh Banda
*/

import java.util.Scanner;

public class WiFiDiagnosis {

	public static void main(String[] args) {
		//A string is declared to be used as a comparison to the users input
		String str1 = new String("no");
		
		//This is the first line the user sees when the program is running
		System.out.println("If you have a problem  with internet connectivity, this Wifi Diagnosis might work.");
		System.out.println("\n");
		System.out.println("First step: reboot your computer");
		System.out.println("Are you able to connect with the internet?(yes or no)");
		
		//Scanner instance is created to collect the users responses
		Scanner scan = new Scanner(System.in);
		String str2 = scan.nextLine();
		
		//The if statements compare the users responses to the initially declared string
		
		if (str2.equals(str1)) {
			System.out.println("Second Step: reboot your router");
			System.out.println("Now are you able to connect to the internet?(yes or no)");
			String str3 = scan.nextLine();
			if(str3.equals(str1)) {
				System.out.println("Third Step: make sure the cables to your router are plugged in firmly and the router is getting power");
				System.out.println("Now are you able to connect to the internet?(yes or no)");
				String str4 = scan.nextLine();
				if(str4.equals(str1)) {
					System.out.println("Fifth step: contact your ISP");
					System.out.println("Make sure your ISP is hooked up to your router");
				}else {
					System.out.println("Checking the cables seemed to work");
				}
			}else {
				System.out.println("Rebooting the computer seemed to work");
			}
			
		}else {
			System.out.println("Rebooting your computer seemed to work");
		}
		System.exit(0);
	}
}
