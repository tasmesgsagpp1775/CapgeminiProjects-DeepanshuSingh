Main file:- 

import java.util.Arrays;
import java.util.List;

interface MyPredicate<T>{
	boolean operation(T t);
}

public class Assignment4Q2 {
	
		public static void main(String[] args) {
	
		List<Orders> OrderList = Arrays.asList(
										new Orders("Apple MAC",	100000,	"ACCEPTED"),
										new Orders("Asus ROG",	75000,	"COMPLETED"),
										new Orders("Portable Mouse"	,	2000,	"ACCEPTED"),
										new Orders("LED Monitor",		9999,	"COMPLETED")
		);

				System.out.println("Complete list is:");
				System.out.println(OrderList);
				System.out.println("Orders whose price is more than 10000 are:");
				MyPredicate<Orders> o =  x 	->		x.getTotalPrice()	>	10000;
				for( Orders order : OrderList) {
					if(o.operation(order))
						System.out.println(order.getName());
 }
				System.out.println("Orders accepted are:");
				MyPredicate<Orders> O = x		->		x.getStatus().contains("A");
				for( Orders order : OrderList) {
					if(O.operation(order))
						System.out.println(order.getName());
 }
				System.out.println("Orders completed are:");
				MyPredicate<Orders> a = x		->		x.getStatus().contains("L");
				for( Orders order : OrderList) {
					if(a.operation(order))
						System.out.println(order.getName());
		}	
}}

Orders.java:-

public class Orders{
	public String getName() {
		return name;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public String getStatus() {
		return status;
	}
	public Orders(String name, int totalPrice, String status) {
		super();
		this.name = name;
		this.totalPrice = totalPrice;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Orders [name=" + name + ", totalPrice=" + totalPrice + ", status=" + status + "]";
	}
	private String name;
	private int totalPrice;
	private String status;
}