package org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gomathi\\eclipse-workspace\\India\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://letcode.in/alert");
		driver.manage().window().maximize();
		
		WebElement alert = driver.findElement(By.xpath("//button[text()='Simple Alert']"));
		alert.click();
		org.openqa.selenium.Alert alert1 = driver.switchTo().alert();
		
		Thread.sleep(3000);
		
		alert1.accept();	
		
		 driver.findElement(By.xpath("//button[contains(text(),'Confirm Alert')]")).click();
		 Thread.sleep(3000);
		 driver.switchTo().alert().dismiss();
		 
		driver.findElement(By.id("prompt")).click();
		org.openqa.selenium.Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("gomathi");
		alert3.accept();
				
//		driver.switchTo().alert().sendKeys("gomathi");
//		driver.switchTo().alert().accept();
	}

	
}
