class Station 
{
	static String stationName="KSR";
	static String []platform={"Platform1","Platform2","Platform3","Platform4","Platform5","Platform6","Platform7","Platform8","Platform9","Platform10"};
	public static void main(String a[])
	{
		System.out.println(stationName);
		System.out.println(platform[0]);
		System.out.println(platform[1]);
		System.out.println(platform[2]);
		System.out.println(platform[3]);
		System.out.println(platform[4]);
		System.out.println(platform[5]);
		System.out.println(platform[6]);
		System.out.println(platform[7]);
		System.out.println(platform[8]);
		System.out.println(platform.length);
		
		for(int i=0; i<platform.length; i++)
		{
			System.out.println(platform[i]);
		}
	}
}