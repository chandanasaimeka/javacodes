class Terinary
{
	public static void main(String args[])
	{
		int a=200,b=30,c=50;
		int d=(a>b)?((a>c)?a:c):((b>c)?b:c);
		System.out.println(d);
	}
}