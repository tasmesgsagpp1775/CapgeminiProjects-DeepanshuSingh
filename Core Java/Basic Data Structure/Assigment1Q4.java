import java.util.*;
public class Assigment1Q4 {
	public static void main(String[] args)
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Marks:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>60 && b>60 && c>60)
			System.out.println("Passed");
		else if(a+b>60 || b+c>60 || c+a>60)
			System.out.println("Promoted");
		else if(a>60 || b>60 || c>60 || a+b+c<60)
			System.out.println("Failed");
	}

}