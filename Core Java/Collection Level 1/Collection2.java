import java.util.HashSet;

public class Collection2 {
	public static void main(String[] args)
	{
		HashSet<String> hs=new HashSet<>();
		hs.add("Bat");
		hs.add("Ball");
		hs.add("Stumps");
		hs.add("Gloves");
		hs.add("Pads");
		
		System.out.println("Original");	
		System.out.println(hs.size());
		System.out.println(hs);
		
		hs.add("Bat");
		hs.add("Ball");
		hs.add("Stumps");
		
		System.out.println("After adding duplicate elements");
		System.out.println(hs.size());
		System.out.println(hs);
		System.out.println("You can see the purpose of the program is done");
	}

}