class BarTester
{
	public static void main(String a[])
	{
		BarDTO bb=new BarDTO("Manjunatha BAR","majestic");
		System.out.println("BAR NAME  : "+bb.getName()+" \nAdress :   "+bb.getAddress());
		BarDTO ba=new BarDTO("Ganesha BAR","RRNAgar");
		System.out.println("BAR NAME  : "+ba.getName()+" \nAdress :   "+ba.getAddress());
	}
}