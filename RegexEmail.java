package com.regex_email;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailUC2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String match = "^(abc)+[ -~]*@bridgelabz+[ -~]*$";			//String pattern to be detected

		//Checking for matches
		while(true) {
			
			// String to be scanned to find the pattern.
			System.out.print("Please enter your Email: ");
			String line = sc.nextLine();
			
			boolean check=line.matches(match);							//Condition check
			if(check) {
				break;
			}else{
				System.out.println("Incorrect format. Please try again.");
				System.out.println();
			}
		}
		System.out.println("Program End.");
	}
}
