class ADS
{
	public static void main(String []args)
	{
		char a='c';
		if (((a>=65)&&(a<=90))||((a>=97)&&(a<=122)))
		{
			System.out.println("It's a Alphabet");
		}
		else if ((a>=48)&&(a<=57))
		{
			System.out.println("It's a digit");
		}
		else
		{
			System.out.println("Special characters");
		}
	}
}