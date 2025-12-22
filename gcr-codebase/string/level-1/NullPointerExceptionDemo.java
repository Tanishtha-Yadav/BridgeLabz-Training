import java.util.*;
public class NullPointerExceptionDemo{
	//  method to  demonstrate exception
	public static void exception()
	{
			String text = null;
			System.out.println(text.length());
	}
	
	// method to handle exception
	public static void handleException()
	{
			String text = null;
			try
			{
				System.out.println(text.length());
			}
			catch(NullPointerException e)
			{
				System.out.println("Null pointer exception caught");	
			}
	}
	
	public static void main(String[]args)
	{
	//	String text = null;
	//	System.out.println(text.length());
	
	//	exception();         cannot use both at a time
		handleException();
	}
}