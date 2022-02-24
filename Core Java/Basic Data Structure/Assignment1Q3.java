import java.util.*;
public class Assignment1Q3 {
	public static void main(String[] args)
	{
		double principal,rate;
		int time;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Principal:");
		principal=sc.nextDouble();
		System.out.println("Enter the Rate of Interest:");
		rate=sc.nextDouble();
		System.out.println("Enter the time:");
		time=sc.nextInt();
		double si,ci;
		si=(principal*rate*time)/100;
		ci=principal*(Math.pow((1+rate/100),time))-principal;
		System.out.println("Simple Interest is:"+si);
		System.out.println("Coumpound Interest is:"+ci);
	}
}