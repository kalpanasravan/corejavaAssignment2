package acadglidJavaprg;

public class Acadsec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		t.display();
		//System.out.println("b is "+ a-- - --a);
	}
}
class Test {
    int a =20;
    int b =10;
    int c = a-- - --a;
	int d= a--;
	int e= a>>2;
	int f= a&b;


	void display()
	{
		System.out.println("a is "+a);
		System.out.println("b is " +b);
		System.out.println("c is " +c);
		System.out.println("d is "+d);
		System.out.println("e is "+e);
		System.out.println("f is "+f);
		}
	}


