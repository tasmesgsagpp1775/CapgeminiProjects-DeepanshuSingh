import java.util.*;
public class Assignment1Q2
{
	public static void main(String[] args)
	{
		int n,rem,sum=0;
		System.out.println("Armstrong numbers between 100 and 999 are:");
		for(int i= 100;i<=999;i++)
		{
			n=i;
			while(n>0)
			{
				rem=n%10;
				sum=sum+(rem*rem*rem);
				n=n/10;
			}
			if(sum==i)
			{
				System.out.println(i+" ");
			}
			sum=0;
		}
	}
}