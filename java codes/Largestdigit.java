import java.util.Scanner;
class Largestdigit
{
	public static void main(String args[])
	{
	System.out.println("Enter a value : ");		
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt(),temp=num,s=0;//4589
	for(int rem=0;num>0;num/=10)
	{
		rem=num%10;
		if(rem>s)
		s=rem;
		
	}
	System.out.println("The largest num in the "+temp+" is : "+s);	

	}
}