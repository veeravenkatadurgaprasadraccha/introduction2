package exercise;

public class AverageMarks {
	public static void main(String arg[])
	  {
	    int n=6,avg=0;
	 
	    int a[]=new int[n];
	 
	    a[0]=10;
	 
	    a[1]=20;
	 
	    a[2]=30;
	 
	    a[3]=40;
	 
	    a[4]=50;
	    a[5]=10;
	    for(int i=0;i<n;i++)
	    	 
	        avg=avg+a[i];
	    System.out.println("average of  ("+a[0]+","+a[1]+","+a[2]+","+a[3]+","+a[4]+","+a[5]+")  is ="+ avg/n);
	 
	  }
}
