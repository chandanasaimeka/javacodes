class Vote
{
	public static void main(String args[])
	{
		int age=55,year=2020;
		if(age>=50)
		{
			System.out.println("Senior citizen");
		}
		 if(age>=25)
		{
			if(year>=2020)
			{
				System.out.println("Graduated & eligible for MNC elections");
			}
			else
			{
				System.out.println("Eligible for mla elections");
			}
		}
		else if(age>=18)
		{
			System.out.println("eligible for vote");
		}
		else
		{
			System.out.println("minor");
		}
	}
}