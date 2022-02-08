package com.demo1;

public class demo {

	public static void main(String[] args) {
		String getCheckinMonth = "January";
		String str = "//div[text()=  " + "'"+getCheckinMonth+ "'" +"  ]//parent::div//following-sibling::div//div//div[text()='\"+getCheckinDate+\"']";
System.out.println(str);
	}

}
