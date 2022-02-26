import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Test{
	
}
class A{
@Test
	public int test_case(int obj1, int obj2) {
		return obj1+obj2;
	}
}
public class Annotation1 {

public static void main(String[] args) {
		A obj3=new A();
		System.out.println(obj3.test_case(2,8));

	}

}