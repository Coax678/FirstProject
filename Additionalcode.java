import java.util.Scanner;

class ABC
{
	int a,b,c; //member variables
	Scanner S=new Scanner(System.in);
	
	public void Getdata() {
		System.out.println("Enter 2 values ");
		a=S.nextInt();
		b=S.nextInt();
		
	}
	public void Add()
	{
		c=a+b;
		System.out.println("Sum is "+c);
	}
}

public class DemoOOPs1 {

	public static void main(String[] args) {
		ABC obj=new ABC();//creating Object
		obj.Getdata();
		obj.Add();

	}



