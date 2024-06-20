import java.util.Scanner;
class Mn
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=1;
		System.out.println("Enter m value : ");
		int m=sc.nextInt();
		System.out.println("Enter n value : ");
		int n=sc.nextInt();
		for(;n>=1;n--)
		{
			t*=m;
		}
		System.out.println(t);
	}
}