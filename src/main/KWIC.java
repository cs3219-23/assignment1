package main;

import PipeAndFilter.PipeAndFilter;
import SharedData.Master;
import java.io.IOException;
import java.util.Scanner;

public class KWIC {

	private static final String SHARED_DATA = "1";
	private static final String PIPE_AND_FILTER = "2";
	
	private static final String FLAG_SHARED_DATA = "-s";
	private static final String FLAG_PIPE_AND_FILTER = "-p";
	
	public static void main(String[] args) throws IOException {
		String architecture = null;
		
		if(args.length == 3){
			architecture = getArchitecture(args[2]);
		} else if (args.length < 2) {
			System.out.println("Usage: KWIC <word file path> <ignore word file path> [-s (shared data)|| -p (pipe and filter)]");
			return;
		}
		
		if(architecture == null){
			System.out.println("Choose the architecture design you want to run the program in: ");
			System.out.println("1 -> Shared Data");
			System.out.println("2 -> Pipe-and-Filter");
			System.out.print("Choice : ");
			Scanner sc = new Scanner (System.in);
			architecture = sc.next();
			sc.close();
		}
		
		if (architecture.equals(SHARED_DATA)) {			
			new Master(args);			
		} else if (architecture.equals(PIPE_AND_FILTER)) {			
			new PipeAndFilter(args);			
		} else {
			System.out.println("Invalid architecture choice!");
		}			

	}
	
	private static String getArchitecture(String flag){
		if(flag.equals(FLAG_SHARED_DATA)){
			return SHARED_DATA;
		} else if (flag.equals(FLAG_PIPE_AND_FILTER)){
			return PIPE_AND_FILTER;
		} else {
			return null;
		}
	}

}
