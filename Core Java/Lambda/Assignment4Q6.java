import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Assignment4Q6 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
	    list.add("Java");
	    list.add("JavaScript");
	    list.add("Ruby");
	    list.add("Python");
	    list.add("Spring");
	    
	    printList(list,p->p.toUpperCase());
	      

	}

	private static void printList(List<String> list,UnaryOperator<String> unaryOperator) {
		
		list.replaceAll(unaryOperator);
		for (String i: list) {
			unaryOperator.apply(i);
			System.out.println(i);
		}
		
	}

}