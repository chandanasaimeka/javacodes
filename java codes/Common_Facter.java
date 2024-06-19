class Common_Facter
{
	public static void main(String args[])
	{
		int num1=10,num2=20,i=1,j=1,gt=0;
		if(num1<num2)	
			gt=num1;
		else
			gt=num2;
		while(i<=gt)
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