import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class CF3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1= "A quick brown fox jumps over the lazy dog.";
		String str2[] = str1.split(" ");
		List<String> MyList = (List<String>) 	Arrays.asList(str2);
			ArrayList<String> x = new ArrayList<String>(MyList);
			for(int i=0; i<x.size();i++)
			{
				System.out.println(x.get(i));
			}
	}

}
