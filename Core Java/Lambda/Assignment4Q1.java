@FunctionalInterface
interface Operations{
	float opt(float num1, float num2);
}


public class Assignment4Q1 {
	
	public static void main(String[] args) {
		
		Operations addition = (num1,num2) -> (num1 + num2);
		System.out.println("Addition = " + addition.opt(13,5));
		
		Operations subtraction = (num1,num2) -> (num1-num2);
		System.out.println("Subtraction = " + subtraction.opt(13,5));
		
		Operations multiplication = (num1,num2) -> (num1*num2);
		System.out.println("Multiplication = " + multiplication.opt(13,5));
		
		Operations division = (num1,num2) -> (num1/num2);
		System.out.println("Division = " + division.opt(13,5));
		
	}

}
