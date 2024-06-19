class Factors
{
	public static void main(String args[])
	{
		int num=36,i=1,sum=0,p=1;	
		while(i<=num)b
		{
			if((num%i)==0)
			{
				System.out.println(i);
				if((i%2)==0)
				{
					sum+=i;
				}
				else
				{
					p*=i;//p=p*i
				}

			}
			i++;
		}
		System.out.println("Sum of even factors :"+sum);
		System.out.println("Product of odd faters :"+p);	
}
}