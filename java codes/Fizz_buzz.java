class Fizz_buzz
{
	public static void main(String [] args)
	{
		int s=1,e=100;
		
		while(s<=e)
		{
			if(((s%3)==0) && ((s%5)==0))
			{
			System.out.println("Fizz Buzz");
			}
			else if((s%3)==0)
			{
			System.out.println("Fizz");
			}
			else if((s%5)==0)
			{
			System.out.println("Buzz");
			}

			else
			{
			System.out.println(s);
			}
			s++;
			
		}
	}

}