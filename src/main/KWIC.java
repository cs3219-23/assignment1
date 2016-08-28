package main;

import PipeAndFilter.PipeAndFilter;
import SharedData.Master;
import java.io.IOException;
import java.util.Scanner;

/*
 * Assumptions : The arguments for the two text files must be correct.
 * 				 The text file for the input data lines must exist.
 *               The text file for the words to ignore must exist.             
 */

public class KWIC {

	private static final String SHARED_DATA = "1";
	private static final String PIPE_AND_FILTER = "2";
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("Choose the architecture design you want to run the program in: ");
		System.out.println("1 -> Shared Data");
		System.out.println("2 -> Pipe-and-Filter");
		System.out.print("Choice : ");
		Scanner sc = new Scanner (System.in);
		String choice = sc.next();
		
		if (choice.equals(SHARED_DATA)) {			
			new Master(args);			
		} else if (choice.equals(PIPE_AND_FILTER)) {			
			new PipeAndFilter(args);			
		} else {
			System.out.println("Invalid choice!");
		}
		
		sc.close();

	}

}
