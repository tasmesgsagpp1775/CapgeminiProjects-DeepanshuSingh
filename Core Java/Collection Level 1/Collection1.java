import java.util.TreeMap;
import java.util.*;
public class Collection1 {
	public static void main(String[] args)
	{
		TreeMap<Long,String> contact=new TreeMap<>();
		contact.put((long) 935345532, "Person1");
		contact.put((long) 923427592, "Person2");
		contact.put((long) 910475632, "Person3");
		contact.put((long) 900242542, "Person4");
		System.out.println(contact.keySet());
		System.out.println(contact.values());
		System.out.println(contact);
	}
}