// 9. School Bus Attendance System 🚍
// Track 10 students' presence.
// ● Use for-each loop on names.
// ● Ask "Present or Absent?"
// ● Print total present and absent counts.
import java.util.*;
public class BusAttendence{
	
	public static void attendence()
	{
		Scanner sc = new Scanner(System.in);
		
		String student[] = new String[10];
		System.out.println("Enter the name of the students : ");
		for(int i=0;i<10;i++)
		{
			student[i]=sc.next();
		}
		
		int present=0;
		int absent=0;
		for (String name : student) 	
		{
			System.out.println(name + " Present or Absent ?");
			String status = sc.next();

		if (status.equalsIgnoreCase("Present")) 
		{
			present++;
		}
		else 
		{
			absent++;
		}
}

		System.out.println("Present : "+present+" Absent : "+absent);
		
	}
	public static void main(String[]args)
	{
		attendence();
	}
} 