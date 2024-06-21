import java.util.Scanner;
class Armstrong
{
	public static void main(String args[])
	{
	System.out.println("Enter a value : ");		
	Scanner sc=new Scanner(System.in);
		int num=sc.nextInt(),c=0,temp=num,s=0;
		while(num!=0)
		{
			int rem=num%10;
			c++;
			num=num/10;
		}
		num=temp;
		for(int rem=0;num>0;num/=10)
		{
			rem=num%10;
			int p=(int)(Math.pow(rem,c));
			s+=p;
		}
	if(s==temp)
	{
		System.out.println("Its an armstrong number");
	}
	else
	{
		System.out.println("Its not an armstrong number");
	}
	}
}