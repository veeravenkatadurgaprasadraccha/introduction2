package exercise;

public class Discount {
	public static void main(String args[])
	{
 
	double  dis,amount,markedprice,s;
               
	markedprice=1000;
 
        dis=25;		
	
	System.out.println("markedprice= "+markedprice);
 
	System.out.println("discount rate="+dis);
         
        s=100-dis;
 
	amount= (markedprice/100)*s;
 
	System.out.println("amount after discount="+amount);
 
	}
}
