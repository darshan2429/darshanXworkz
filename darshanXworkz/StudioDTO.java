public class StudioDTO
{
	private String name;
	private String address;
	
	public StudioDTO(String nm,String ad)
	{
		name=nm;
		address=ad;
	}
	public String getName()
	{
		return name;
	}
	public String getAddress()
	{
		return address;
	}
}