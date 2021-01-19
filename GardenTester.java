class GardenTester
{
	public static void main(String a[])
	{
	GardenDTO dto=new GardenDTO();
	dto.setName("bharathi garden");
	dto.setAddress("jayanagar");
	System.out.println(dto.getName()+" "+ dto.getAddress()+" "+GardenDTO.type);
	}
}