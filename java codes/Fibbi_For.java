import java.util.Scanner;
class Fibii_For
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Value: ");
		int a=sc.nextInt();
	System.out.println("Enter b Value: ");
		int b=sc.nextInt();
	System.out.println("Enter how many terms you want : ");
		int i=sc.nextInt();
	int t=0;
	System.out.print(a+" "+b+" ");
		for (;i>=1;i--)
		{
			t=a+b;
			a=b;
			b=t;
			System.out.print(t+" ");
		}
	}
}