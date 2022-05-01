
public class SimpleArray {
	public static void main(String args[]) {
        int a[]=new int[5];
        a[0]=10;// initialization
        a[1]=20;a[2]=70;a[3]=40;a[4]=50;
        
        // traversing array
        for(int i = 0;i<a.length;i++)
            System.out.println(a[i]);
        //for-each loop
        System.out.println("For each loop");
        for(int i:a)  
        	System.out.println(i);
	}
}
