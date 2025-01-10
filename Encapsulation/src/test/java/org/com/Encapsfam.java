package org.com;

import java.io.File;
import java.io.FileInputStream;
import java.util.LinkedHashMap;
import java.util.Map;

public class Encapsfam {
	
	Map<String, Integer> m;
	
	private String userId;
	private int pass;
	private int tokenNo;
	private int balance;
	
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		if(userId.equals("magi@123")) {
				this.userId = "magi username is correct";
	}
		else if(userId.equals("nith@123")) {
			this.userId = "nith username is correct";
		}
	
		else if(userId.equals("sam@123")) {
			this.userId = "sam username is correct";
		}
		else {
			this.userId="Invalid username";
		}}
	
	
	public int getPass() {
		return pass;
	}
	public void setPass(int pass) {
		if(pass==123 && userId.equals("magi username is correct")) {
		this.tokenNo=1;
	}
		else if(pass==222 && userId.equals("nith username is correct")) {
			this.tokenNo=2;
		}
		else if(pass==333 && userId.equals("sam username is correct")) {
			this.tokenNo=3;
		}
		else {
			this.tokenNo=0;
		}}
			
			
	public int getTokenNo() {
		return tokenNo;
	}
	public void setTokenNo(int tokenNo) {
		this.tokenNo = tokenNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		if(tokenNo==1) {
	//	this.balance = ;
	}}
	
	public void readDataFromDatabase() {
		m=new LinkedHashMap();
		File f=new File("C:\\Users\\gomathi\\eclipse-workspace\\Encapsulation\\src\\test\\resources\\Encapsfam.xlsx");
		FileInputStream fs=new FileInputStream(f);
		Workbook w= new XSSFWorkbook(fs);
		Sheet sheet = w.getSheet("Sheet1");
		Row row =Sheet.grtRow(1);
		
		
		
		
		
		
	}
	
	

}
