class Duplicate
{
	
	public static void main(String a[])
	{
		String str="RATAVARA";
		char[] dup = str.toCharArray();
		System.out.println(dup.length);
		for(int i=0; i<str.length();i++)
		{
			for(int j=i+1; j<str.length(); j++)
			{
				if(dup[i]==dup[j])
				{
					System.out.print( dup[j] + "  ");
					break;
				}
			}
		}
	}
}
