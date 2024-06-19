class Highest
{
	public static void main(String args[])
	{
		int num1=6,num2=40,i=1,j=1,gt=0,ht=0;
		gt=(num1<num2)?gt=num1:gt=num2;
		while(i<=gt)
		{
			if(((num1%i)==0) && ((num2%j)==0))
			{
					ht=i;	
			}
			i++;
		}y
	System.out.println(ht);
		
		
	}
}