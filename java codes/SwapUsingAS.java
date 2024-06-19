class SwapUsingAS
{
	public static void main(String args[])
	{
		int c=10,d=20,temp=0;
		System.out.println("Before Swaping : \n"+"c = " +c + " b = "+d);
		temp=c;
		c=c+d;
		d=c-d;
		c=c-d;
		System.out.println("After Swapping :\n"+"c = " +c + " b = "+d);
	}
}