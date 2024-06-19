class Vowel
{
	public static void main(String args[])
	{
		char a='x';
		if((a=='a')||(a=='e')||(a=='i')||(a=='o')||(a=='u'))
		{
			switch(a)
			{
			case 'a': System.out.println("Apple");
			break;
			case 'e': System.out.println("Eagle");
			break;
			case 'i': System.out.println("Ink");
			break;
			case 'o': System.out.println("Orange");
			break;
			case 'u': System.out.println("Unix");
			break;
			}
		}
		else
		{
			System.out.println("Given character is not a vowel");
		}
	}
}