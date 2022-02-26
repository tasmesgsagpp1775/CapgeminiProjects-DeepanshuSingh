import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;

class Fruit { 
	String name; 
	int calories; 
	int price; 
	String color;
	public Fruit(String name, int calories, int price, String color) {
		super();
		this.name = name;
		this.calories = calories;
		this.price = price;
		this.color = color;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public int getCalories() {
		return calories;
	}
	public int getPrice() {
		return price;
	}
	public String getColor() {
		return color;
	}
	
	public String toString() {
		return "Fruit [Name:"+name+" Calories:"+calories+" Price:"+price+" Color:"+color+"]";
	}
}

class News { 
	int newsId; 
	String postedByUser; 
	String commentByUser; 
	String comment;
	public News(int newsId, String postedByUser, String commentByUser, String comment) {
		super();
		this.newsId = newsId;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}
	public int getNewsId() {
		return newsId;
	}
	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}
	public String getPostedByUser() {
		return postedByUser;
	}
	public void setPostedByUser(String postedByUser) {
		this.postedByUser = postedByUser;
	}
	public String getCommentByUser() {
		return commentByUser;
	}
	public void setCommentByUser(String commentByUser) {
		this.commentByUser = commentByUser;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	} 
	
	public String toString() {
		return "News [NewID:"+newsId+" PostedByUser:"+postedByUser+" CommentByUser:"+commentByUser+" Comment:"+comment+"]";
	}
}
class Trader { 
	String name; 
	String city;
	public Trader(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	} 
	public String toString() {
		return "Trader [Name:"+name+" City:"+city+"]";
	}
	
}

class Transaction { 
	Trader trader; 
	int year; 
	int value;
	public Transaction(Trader trader, int year, int value) {
		super();
		this.trader = trader;
		this.year = year;
		this.value = value;
	}
	public Trader getTrader() {
		return trader;
	}
	public void setTrader(Trader trader) {
		this.trader = trader;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	} 
	
	public String toString() {
		return "Transaction [Trader:"+trader+" Year:"+year+" Value:"+value+"]";
	}

}
public class StreamsAssignmentpdf {

	public static void main(String[] args) {
		Fruit fruit1 = new Fruit("Apple", 52, 150, "Red");
		Fruit fruit2 = new Fruit("Banana", 89, 60, "Yellow");
		Fruit fruit3 = new Fruit("Grapes", 67, 55, "Green");
		Fruit fruit4 = new Fruit("Papaya", 120, 110, "Orange");
		Fruit fruit5 = new Fruit("StrawBerries", 33, 170, "Pink");
		Fruit fruit6 = new Fruit("Mango", 60, 160, "Yellow");
		Fruit fruit7 = new Fruit("Pomegranate", 234, 90, "Red");
		
		List<Fruit> fruitList= new ArrayList<>();
		fruitList.add(fruit1);
		fruitList.add(fruit2);
		fruitList.add(fruit3);
		fruitList.add(fruit4);
		fruitList.add(fruit5);
		fruitList.add(fruit6);
		fruitList.add(fruit7);
		
		News news1 =new News(110, "ABP", "Ravi", "Today weather will be sunny");
		News news2 =new News(112, "AajTak", "Rohan", "Today weather will be rainy");
		News news3 =new News(113, "SportTak", "Vikrant", "Today's match will go on");
		News news4 =new News(115, "NDTV", "Tanmay", "Today weather will be windy");
		News news5 =new News(111, "DD National", "Suresh", "Covid cases are increasing");
		
		List<News> newsList=new ArrayList<>();
		newsList.add(news1);
		newsList.add(news2);
		newsList.add(news3);
		newsList.add(news4);
		newsList.add(news5);
		
		Trader Trader1=new Trader("Sourabh", "Delhi");
		Trader Trader2=new Trader("Tanmay", "Mumbai");
		Trader Trader3=new Trader("Siddarth", "Kurnool");
		Trader Trader4=new Trader("Vinit", "Mumbai");
		Trader Trader5=new Trader("Hemant", "Indore");
		
		List<Trader> TradeList =new ArrayList<>();
		TradeList.add(Trader1);
		TradeList.add(Trader2);
		TradeList.add(Trader3);
		TradeList.add(Trader4);
		TradeList.add(Trader5);
		
		Transaction transaction1=new Transaction(Trader1, 2001, 44);
		Transaction transaction2=new Transaction(Trader2, 2002, 36);
		Transaction transaction3=new Transaction(Trader3, 2003, 181);
		Transaction transaction4=new Transaction(Trader4, 2004, 110);
		Transaction transaction5=new Transaction(Trader5, 2021, 66);
		
		List<Transaction> transactionList=new ArrayList<>();
		transactionList.add(transaction1);
		transactionList.add(transaction2);
		transactionList.add(transaction3);
		transactionList.add(transaction4);
		transactionList.add(transaction5);
		
		System.out.println("1.Display the fruit names of low calories fruits i.e. calories < 100 sorted in\n"
				+ "descending order of calories.");
		fruitList.stream().filter(p->p.getCalories()<100).sorted((a,b)->b.getCalories()-a.getCalories()).forEach(p->System.out.println(p));
		
		System.out.println("\n2.Display color wise list of fruit names:");
		fruitList.stream().sorted((a,b)->a.getColor().compareTo(b.getColor())).forEach(p->System.out.println(p.getColor()+" "+p.getName()));;
		
		System.out.println("\n3.Display only RED color fruits sorted as per their price in ascending order:");
		fruitList.stream().filter(p->p.getColor().equals("Red")).sorted((a,b)->a.getPrice()-b.getPrice()).forEach(p->System.out.println(p));;
		
		System.out.println("\n4.Find out the newsId which has received maximum comments:");
		newsList.stream().collect(Collectors.groupingBy(s -> s.getNewsId(), Collectors.counting()))
	      .entrySet()
	      .stream()
	      .max(Comparator.comparing(Entry::getValue))
	      .ifPresent(System.out::println);
		
		System.out.println("\n5.Find out how many times the word 'budget' arrived in user comments all\r\n"
				+ "news:");
		long countNews= newsList.stream().filter(p->p.getComment().contains("budget")).count();
		System.out.println(countNews);
		
		System.out.println("\n6.Find out which user has posted maximum comments:");
		newsList.stream().collect(Collectors.groupingBy(s -> s.getPostedByUser(), Collectors.counting()))
	      .entrySet()
	      .stream()
	      .max(Comparator.comparing(Entry::getValue))
	      .ifPresent(System.out::println);
		
		System.out.println("\n7.Display commentByUser wise number of comments.");
		newsList.stream().collect(Collectors.groupingBy(s -> s.getCommentByUser(), Collectors.counting()))
	      .entrySet()
	      .stream().forEach(p->System.out.println(p));
		
		System.out.println("\n8.Find all transactions in the year 2011 and sort them by value (small to\r\n"
				+ "high).");
		transactionList.stream().filter(p->p.getYear()==2011).sorted((a,b)->a.getValue()-b.getValue()).forEach(p->System.out.println(p));
		
		System.out.println("\n9.What are all the unique cities where the traders work?");
		TradeList.stream().distinct().collect(Collectors.groupingBy(s -> s.getCity())).entrySet().stream().forEach(p->System.out.println(p.getKey()));
		
		System.out.println("\n10.Find all traders from Kurnool and sort them by name?");
		TradeList.stream().filter(p->p.getCity().equals("Kurnool")).sorted((a,b)->a.getName().compareTo(b.getName())).forEach(p->System.out.println(p));
		
		System.out.println("\n11.Return a string of all traders names sorted alphabetically?");
		String string=TradeList.stream().sorted((a,b)->a.getName().compareTo(b.getName())).map(p->p.getName()).reduce(" ", (n1, n2) -> n1 + n2);
		System.out.println(string);
		
		System.out.println("\n12.Are any traders based in Indore?.");
		TradeList.stream().filter(p->p.getCity().equals("Indore")).sorted((a,b)->a.getName().compareTo(b.getName())).forEach(p->System.out.println(p));
		
		System.out.println("\n13.. Print all transactions values from the traders living in Kurnool.");
		transactionList.stream().filter(p->p.trader.getCity().equals("Kurnool")).forEach(p->System.out.println(p.getValue()));
		
		System.out.println("\n14.What's the highest value of all the transactions?");
		transactionList.stream().mapToInt(Transaction::getValue).max().ifPresent(System.out::println);
		
		System.out.println("\n15.What's the lowest value of all the transactions?");
		transactionList.stream().mapToInt(Transaction::getValue).min().ifPresent(System.out::println);
		
		
	}

}