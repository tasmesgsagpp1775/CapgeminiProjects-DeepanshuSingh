import java.util.*;
public class TestException_2 {
	public static void main(String[] args)
	{
		int a=10,b=0;
		try {
			try 
		    {
				System.out.println(a/b);
			} 
		    catch (ArithmeticException e)
		    {
				
				System.out.println("Division by zero");
			}
			throw new UnsupportedOperationException();
		}
		 catch(UnsupportedOperationException e)
		{
			 System.out.println("Division by zero is not possible");
			
		}
	    
	    
		
	}

}