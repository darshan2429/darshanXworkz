class MovieName
{
	
	static int noOfMovies=10;
	static String movieNames[]={"Rathavara","Rikki","Student of the year","Sarathi","Love Mocktail","Diya","Ugram"};
	public static void main(String a[])
	{
	String mv[]=getMovieNames();
	System.out.println(mv);
	}
	static String[] getMovieNames()
	{
			return movieNames;
	}
	
}