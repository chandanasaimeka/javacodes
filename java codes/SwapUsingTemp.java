class SwapUsingTemp
{
	public static void main(String args[])
	{
		int c=10,b=20,temp=0;
		System.out.println("Before Swaping : \n"+"c = " +c + " b = "+b);
		temp=c;
		c=b;
		b=temp;
		System.out.println("After Swapping :\n"+"c = " +c + " b = "+b);
	}
}