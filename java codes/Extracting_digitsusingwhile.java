import java.util.Scanner;
class Extract_digits
{
	public static void main(String args[])
	{
	System.out.println("Enter a value : ");		
	Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		while(num>0)
		{
			int rem=num%10;
			System.out.println(rem);
			num=num/10;
		}
	}
}