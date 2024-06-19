class Common
{
	public static void main(String args[])
	{
		int num1=10,num2=20,i=1,j=1;

		while(i<=num1 && j<=num2)
		{
			if(((num1%i)==0) && ((num2%j)==0))
			{
				if(i==j)
					System.out.println(i);		
			}
			i++;
			j++;
		}
		
		
	}
}