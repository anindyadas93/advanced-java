package enumset;

import java.util.*;  

enum days {  
  SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY  
}  

public class EnumSetSample1 {  
	public static void main(String[] args) {  
	  Set<days> set1 = EnumSet.allOf(days.class);  
      System.out.println("Week Days:"+set1);  
      Set<days> set2 = EnumSet.noneOf(days.class);  
      System.out.println("Week Days:"+set2); 
      Set<days> set3 = EnumSet.of(days.SUNDAY);
      System.out.println(set3);
	}  
}  
