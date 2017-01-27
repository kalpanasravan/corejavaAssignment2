import java.util.*;
/*program to swap two variables without using third variable
*/
public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 swap1 sw1= new swap1();
		 sw1.show();
		 sw1.logic();
		
	}

}

class swap1

{
	Scanner st1,st2;
	int a,b;
	
	swap1()
	{
		st1 = new Scanner(System.in);
		st2 = new Scanner(System.in);
	}

	void show()
	{
		
		System.out.println("pls insert a");
		a = st1.nextInt();
		System.out.println("enter b");
		b=st2.nextInt();
		System.out.println("value of a before swap is" +a);
		
		
		System.out.println("value of b before swap is "+b);

		
	}
	
	void logic()
	{
		a = a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("value of a after swap is" +a);
		
		
		System.out.println("value of b after swap  is " +b);
		
	}
}



