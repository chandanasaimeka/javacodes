import java.util.Scanner;
class Extract_digits_for
{
	public static void main(String args[])
	{
	System.out.println("Enter a value : ");		
	Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int rem=0;num>0;num/=10)
		{
			rem=num%10;
			System.out.println(rem);
		}
	}
}