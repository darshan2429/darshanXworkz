class Addition1
{
	public static void main(String a[])
	{
		int total=addNumber(10,20);
		System.out.println(total);
		double total1=addNumber(30.09,40.40);
		System.out.println(total1);
	}
	static int addNumber(int a,int b)
	{
		int c=a+b;
		return c;
	}
	static double addNumber(double a,double b)
	{
		double d=a+b;
		return d;
	}
}