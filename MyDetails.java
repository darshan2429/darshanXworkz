class MyDetails
{
	
	public static void main(String a[])
	{
		String abc=personDetails("darshan");
		long xyz=personDetails(8884546207l);
		System.out.println(abc);
		System.out.println(xyz);
	}
	static String personDetails(String name)
	{
	
		return name;
	}
	static long personDetails(long phNo)
	{
		return phNo;
	}
}
