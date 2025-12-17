import java.util.*;
public class DistributingPen{
	public static void main(String[]args){
		int numberOfPens = 14 , numberOfStudents = 3;
		
		// variable for calculating number of pens per student 
		int penPerStudent = numberOfPens/numberOfStudents;
		
		// variable for number of pen not distributed and left 
		int penLeft = numberOfPens%numberOfStudents;
		
		// displaying output
		System.out.println("The Pen Per Student is "+penPerStudent+" and the remaining pen not distributed is "+penLeft);
	}

}