
public class Assign3 {

	public static void main(String[] args) {
	
	Swapex1 s1=new Swapex1();
	s1.sw1();
	Swapex2 s2= new Swapex2();
	s2.sw2();
	}
}
class Swapex1
{
	void sw1(){
		int x=20;
		int y=10;
		System.out.println("First Example");
		System.out.println("                              ");
		System.out.println("Before swaping numbers X = "+x+" Y = "+y);
		x= x+y;
		y= x-y;
		x= x-y;
		System.out.println("Before swaping numbers X = "+x+" Y = "+y);
		System.out.println("                              ");

	}
	
}


class Swapex2
	{
		
		void sw2()
		{
		int a=20;
		int b=30;
		int temp;
		
		temp=a;
		a=b;
		b=temp;
		System.out.println("Second Example");
		System.out.println("                              ");
		System.out.println("Assigned numbers are :a = "+temp+ " b= "+a);
		System.out.println("After the swaping the numbers are :a= "+a+ " b= "+b);
		}
	
	}



