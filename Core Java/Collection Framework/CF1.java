import java.util.*;

@FunctionalInterface
interface features{
public void func();	
}

public class CF1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float rate,principal,time;
		float si;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principal,time and rate repectively");
		principal = sc.nextInt();
		time = sc.nextInt();
		rate = sc.nextInt();
		si = 	(principal*rate*time)/100;
		features obj = ()-> System.out.println("Simple interest for the given values is:" +si);
		obj.func();
	}

}
