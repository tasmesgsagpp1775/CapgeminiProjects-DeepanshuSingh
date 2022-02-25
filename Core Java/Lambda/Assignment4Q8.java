import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
public class Assignment4Q8 {

	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(10,20,30,40,50);
		Print(list,p->System.out.println(p));
	}
	private static void Print(List<Integer> list,Consumer<Integer> consumer) {
		Thread thread =new Thread(()-> {
				for (Integer i:list)
					consumer.accept(i);				
			}
		);
thread.start();
		
	}

}