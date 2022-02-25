public class CF2 {

	public static void main(String[] args)
	{

		// int
		var x = 100;

		// double
		var y = 1.90;

		// char
		var z = 'a';

		// string
		var p = "name";

		// boolean
		var q = false;

		// type inference is used in var keyword in which it automatically detects the datatype of a variable
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(p);
		System.out.println(q);
	}
 	// code works perfectly fine until this point and then we will show how to not do it.
	 var x = 50;
	    {
	        System.out.println(x);
}
	    //now this gives us error stating that we can not use "var" here.
	    //it cannot be used to declare instance and global variables
}