/*class Exhibition
{
	static String type="car";
	static int total=34;
	public static void main(String a[])
	{
		exhibit(type);
		exhibit(total,type);
	}
	static void exhibit(String type)
	{
		System.out.println(type +" Exhibition");
	}
	static void exhibit(int total,String type)
	{
		System.out.println(type+ " Exhibition " +" with "+ total +" cars");
	}
}*/



//this program we can use the return type 
//return type is also a method over loading
//we can use return type we can print the statement into the main class and
//we can declare a return data type and variable into the main class
class Exhibition
{
	static String type="car";
	static int total=34;
	public static void main(String a[])
	{
		String finalType=exhibit(type);
		System.out.println(finalType);
		int finalTotal=exhibit(total);
		System.out.println(finalTotal);
	}
	static String exhibit(String type)
	{
		return type;
	}
	static int exhibit(int total)
	{
		return total;
	}
}