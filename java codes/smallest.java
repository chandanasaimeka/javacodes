class Small
	{
		public static void main(String args[])
			{

		int a=25,b=30,c=8;
		if((a<c) && (a<b))
			{
				System.out.println(a+" is smallest");
			}
		else if((b<a) && (b<c))
			{
				System.out.println(b+" is smallest");
			}
		else if((c<a) && (c<b))
			{
				System.out.println(c+" is smallest");
			}
		else
			{
				System.out.println("Invalid Number");
			}
			}
	}