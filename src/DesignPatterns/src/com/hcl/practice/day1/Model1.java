package DesignPatterns.src.com.hcl.practice.day1;

public class Model1 implements Phone{
	private String Name;
	private String Ram;
	private String Price;
	

	public Model1(String name, String ram, String price) {
		Name = name;
		Ram = ram;
		Price = price;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.Name;
	}

	@Override
	public String getRam() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "Model1 [Name=" + Name + ", Ram=" + Ram + ", Price=" + Price + "]";
	}
	
	

	

	

}


