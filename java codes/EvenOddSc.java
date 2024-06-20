import java.util.Scanner;
class EvenOdd
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value: ");
		int a=sc.nextInt();
		System.out.println(((a%2)==0)? a+" is even":a+" is odd");
	}
}