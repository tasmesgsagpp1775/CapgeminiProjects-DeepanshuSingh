import java.util.Scanner;
public class Assignment1Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n,rem,s=0,num;
		System.out.println("Enter your number that you want to check:");
		n=sc.nextInt();
		num=n;
		while(n>0)
		{
			rem=n%10;
			s=s+rem*rem*rem;
			n=n/10;
		}
		if(s==num)
			System.out.println(num+ " is an Armstrong Number");
		else
			System.out.println(num+ " is not an Armstrong Number");
	}

}
