package DesignPatterns.src.com.hcl.practice.day1;

public class Model2 implements Phone{
	
	private String Name;
	private String Ram;
	private String Price;
	
	

	public Model2(String name, String ram, String price) {
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
		return this.Ram;
	}

	@Override
	public String getPrice() {
		// TODO Auto-generated method stub
		return this.Price;
	}

	@Override
	public String toString() {
		return "Model2 [Name=" + Name + ", Ram=" + Ram + ", Price=" + Price + "]";
	}
	
	

}
