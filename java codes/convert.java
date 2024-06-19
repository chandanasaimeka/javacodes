class Convertion
{
	public static void main(String []args)
	{
		char a='d';
		if(a>='A' && a<='Z')
		{
			System.out.println((char)(a+32));
		}
		if(a>='a' && a<='z')
		{
			System.out.println((char)(a-32));
		}
	}
}