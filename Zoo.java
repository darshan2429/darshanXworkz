class Zoo
{
	public static void main(String a[])
	{
		String name=entertainment("Mysore Zoo");
		System.out.println("ZOO NAME " +name);
		int noOfAnimals=entertainment(20);
		System.out.println("Number Of Animals " + noOfAnimals);
	}
	static String entertainment(String zooName)
	{
		return zooName ;
	}
	static int entertainment(int animals)
	{
		return animals;
	}
}