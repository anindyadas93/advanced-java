package strings;
import java.lang.*;

public class Example {
	public static void main(String args[]) {
		
		String s1="java";//creating string by Java string literal   
		char ch[]={'s','t','r','i','n','g','s'};    
		String s2=new String(ch);//converting char array to string    
		String s3=new String("java");//creating Java string by new keyword
		String s4="java";
		System.out.println(s1);    
		System.out.println(s2);    
		System.out.println(s3);
		System.out.println(s4);
		
		System.out.println(s1.equals(s3));
		System.out.println(s3.compareTo(s4));
	}
}
