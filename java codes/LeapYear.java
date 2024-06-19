class LeapYear
{
	public static void main(String []args)
	{
		int y=2023;
		if (((y%4)==0)||((y%400)==0)&&((y%100)!=0))
		{
			System.out.println("It's a Leap year");
		}
		else
		{
			System.out.println("It's not a leap year");
		}
	}
}