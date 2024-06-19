class EO
{
	public static void main(String args[])
	{
		int num=15;
		while(num!=1)
		{
			if((num%2)==0)
			{
				System.out.println(num);
				num=num/2;	
			}
			else
			{
				System.out.println(num);
				num=3*(num)+1;
			}
		}
	}
}