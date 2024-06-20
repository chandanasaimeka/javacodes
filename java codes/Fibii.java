import java.util.Scanner;
class Fibii
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
		while (i>=0)
		{
			t=a+b;
			a=b;
			b=t;
			System.out.print(t+" ");
			i--;
		}
	}
}