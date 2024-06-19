class Number
{
	public static void main(String args[])
	{
		char a='5';
		if((a>=48) && (a<=57))
		{
			switch(a)
			{
			case '1': System.out.println("I");
			break;
			case '2': System.out.println("II");
			break;
			case '3': System.out.println("III");
			break;
			case '4': System.out.println("IV");
			break;
			case '5': System.out.println("V");
			break;
			case '6': System.out.println("VI");
			break;
			case '7': System.out.println("VII");
			break;
			case '8': System.out.println("VIII");
			break;
			case '9': System.out.println("IX");
			break;
			default: System.out.println("INVALID INPUT");
			}
		}
		else
		{
			System.out.println("Given character is not a Number");
		}
	}
}