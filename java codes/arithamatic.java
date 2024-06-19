class Arithamatic
{
	public static void main(String args[])
	{
		char a='+';
		int b=10,c=20;
		switch(a)
		{
			case '+': System.out.println(b+c);
			break;
			case '-': System.out.println(b-c);
			break;
			case '*': System.out.println(b*c);
			break;
			case '/': System.out.println(b/c);
			break;
			case '%': System.out.println(b%c);
			break;
			default: System.out.println("Invalid input");
			break;
		}
	}
}