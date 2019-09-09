import java.util.Scanner;

class DCE
{
	int a,b,c; //member variables
	Scanner S=new Scanner(System.in);
	
	public void Getdata() {
		System.out.println("Enter 2 values ");
		a=S.nextInt();
		b=S.nextInt();
		
	}
	public void Mult()
	{
		c=a*b;
		System.out.println("Sum is "+c);
	}
}

public class DemoOOPs2 {

	public static void main(String[] args) {
		DCE obj=new DCE();//creating Object
		obj.Getdata();
		obj.Mult();
	}

}

