class Movies
{
	static int noOfMovies=10;
	static String movieNames[]={"Rathavara","Rikki","Student of the year","Sarathi","Love Mocktail","Diya","Ugram"};
	public static void main(String a[])
	{
		System.out.println(noOfMovies);
		System.out.println(movieNames[0]);
		System.out.println(movieNames[1]);
		System.out.println(movieNames[2]);
		System.out.println(movieNames[3]);
		System.out.println(movieNames[4]);
		System.out.println(movieNames[5]);
		System.out.println(movieNames[6]);
		
		for(int i=0; i<movieNames.length; i++)
		{
			System.out.println(movieNames[i]);
		}
	}
}