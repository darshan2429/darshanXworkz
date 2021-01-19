public class BarDTO
{
	private String name;
	private String address;
	public BarDTO(String nm,String ad)
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