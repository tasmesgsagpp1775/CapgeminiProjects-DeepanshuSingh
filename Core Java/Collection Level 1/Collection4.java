import java.util.*;

public class Collection4 {
    int date,month,year;
    
    public Collection4(int date,int month,int year){
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public String toString(){
        return date+"-"+month+"-"+year;
    }

    public int getYear(){
        return year;
    }
    
    public static void main(String[] args) {
        LinkedList<Collection4> dob = new LinkedList<>();
        

        dob.add(new Collection4(8,11,2000));
        dob.add(new Collection4(01,04,2004));
        dob.add(new Collection4(19,03,1976));
        dob.add(new Collection4(3,8,1976));
        dob.add(new Collection4(18,02,1999));
        dob.add(new Collection4(18,02,1998));
        dob.add(new Collection4(31,07,2016));
        dob.add(new Collection4(20,03,2000));
        dob.add(new Collection4(12,9,2000));
        dob.add(new Collection4(06,11,2000));
        dob.add(new Collection4(21,12,2001));
        
        for (int i = 0 ; i<dob.size();i++){
            int year = dob.get(i).getYear();
            if (year%400==0 || year%100==0 || year%4==0){
                System.out.println(dob.get(i)+" : Born in Leap Year.");
            }else{
                System.out.println(dob.get(i)+" : Not Born in a Leap Year.");
            }
            
        }
    }
    
}