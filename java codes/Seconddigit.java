import java.lang.*;
import java.util.Scanner;
class Seconddigit
{
	public static void main(String args[])
	{
	System.out.println("Enter a value : ");		
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt(),temp=num,l=0;//786 78 7
	for(int rem=0;num>0;num/=10)
	{
		rem=num%10;//rem=6 8 7
		if(rem<l)//6<9 8<6 7<6
		l=rem;//s=6
		
	}
	num=temp;//786
	int lg=1;//6
	for(int rem=0;num>0;num/=10)
	{
		rem=num%10;//6
		if(rem>lg)//6>7
		{
			lg=rem;
			if(lg>l)
				break;
		}
	}
	
	System.out.println("The second smallest num in the "+temp+" is : "+lg);	

	}
}