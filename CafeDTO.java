public class CafeDTO
{
	private String name;
	private String address;
	public CafeDTO(String nm,String ad)
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