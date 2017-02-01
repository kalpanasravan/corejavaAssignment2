package assignment2;


import java.util.Scanner;
/*prg to print the greatest of 3 values */

public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	GrtNum gt= new GrtNum();
		gt.getNumbers();
		gt.great();
		}

}

class GrtNum
{
	
	int a,b,c;
	Scanner aType,bType,cType;
	
	GrtNum()
	{
		aType= new Scanner(System.in);
		bType = new Scanner(System.in);
		cType = new Scanner(System.in);
		
	}
	void getNumbers()
	{
		System.out.println("Enter the a b c values");
		a= aType.nextInt();
		b= bType.nextInt();
		c= cType.nextInt();
	}
	void great()
	{
		if (a>=b && a>=c)
	{
		System.out.println(" a is greater----------" +a);
		
	}
	
	if(b>=a && b>=c)
	{
		System.out.println(" b is greater---------" +b);
		
	}
	
	if(c>=a && c>=b)
	{
		System.out.println(" c is greater--------" +c);
		
	}
}
}