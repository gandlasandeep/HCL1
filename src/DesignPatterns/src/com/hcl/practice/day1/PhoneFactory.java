package DesignPatterns.src.com.hcl.practice.day1;

public class PhoneFactory {
	public static Phone getPhone(PhoneType phoneType) {
		if(phoneType.equals(PhoneType.Model1)) {
			return new Model1("OnePlus","8GB","30000");
		} else if(phoneType.equals(PhoneType.Model2)) {
			return new Model2("IPhoone","8GB","50000");
		}
		else {
			return null;
		}
		
	}

}
