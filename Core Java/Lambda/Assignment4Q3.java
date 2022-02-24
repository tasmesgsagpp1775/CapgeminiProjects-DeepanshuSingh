import java.util.function.*;

public class Assignment4Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Supplier<String>	sup		=	( )	   ->	  "Supplier method invoked here!";
			System.out.println(sup.get());

			Predicate<String> p	= x->true;
			System.out.println(p.test("Predicate method invoked here!"));
			
			System.out.println("Predicate method invoked here!");
			Consumer<String> c = x->System.out.println("Consumer method invoked here!");
			c.accept("Invoked in line above");
			
			Function<String,String> a = x->("Function method invoked here!");
			System.out.println(a.apply(""));
			
}
}
