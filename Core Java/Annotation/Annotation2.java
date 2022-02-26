import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface info{
int AuthorID();
String Author();
String Date();
String Time();
float Version();
}
@info(AuthorID=16, Author = "Deepanshu", Date = "25-02-2022", Time = "15:28", Version = 4.1f)
class Developer{
	int AuthorID;
	String Author;
	String Date;
	String Time;
	float Version;
	public Developer(int id, String name, String date, String time, float ver) {
		super();
		AuthorID = id;
		Author = name;
		Date = date;
		Time = time;
		Version = ver;
	}
	public String toString() {
		return "AuthorID:"+AuthorID+" Author:"+Author+" Date:"+Date+" Time:"+Time+" Version:"+Version;
	}
}
public class Annotation2 {

	public static void main(String[] args) {
		Developer obj = new Developer(100,"Deepanshu", "24-02-2022", "15:35", 4.1f);
		System.out.println(obj.toString());
	}

}