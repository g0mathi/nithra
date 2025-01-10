package org.com;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewProg {
	
	static WebDriver driver;
	
	public static WebDriver ChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		 return driver = new ChromeDriver();
	}
		
		public static WebDriver firefoxBrowser() {
		WebDriverManager.firefoxdriver().setup();
		return driver = new FirefoxDriver();
	}
		
	public static WebDriver edgeBrowser() {
		WebDriverManager.edgedriver().setup();
		return driver = new EdgeDriver();
	}



  public static void launchbrowser(String browserName) {
	  
	  switch (browserName) {
	  
		  case "Chrome":
		  break;
		  case "Firefox":
		  break;
		  case "Edge":
		  break;
		  default:
		  throw new WebDriverException();
		  
	  }}
  
  public static String getPropertyValue(String key) throws IOException {
	  Properties p=new Properties();
	  FileReader f=new FileReader("C:\\Users\\gomathi\\eclipse-workspace\\NewProject\\src\\test\\resources\\Configure\\Property.file");
	  p.load(f);
	  String str = p.get(key).toString();
	  
	return str;
	  
	
}
  public static void launchUrl(String url) { // URL launch
		driver.get(url);
		driver.manage().window().maximize();

	}

	public static void implicitWait(long sec) { // Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	  
  }
	public static void sendKeys(WebElement element, String value, String input) { // sendKeys
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
		w.until(ExpectedConditions.visibilityOf(element));
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			jsSendkeys(element, input);
			e.printStackTrace();
		}
	}

	public static void click(WebElement element) { // click
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
		w.until(ExpectedConditions.elementToBeClickable(element));
		try {
			element.click();
		} catch (Exception e) {
			jsClick(element);
			e.printStackTrace();
		}
	}

//JavascriptExecutor================================================================================================================

	public static void jsSendkeys(WebElement element, String input) { // JS sendKeys
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" + input + "')", element);
	}

	public static void jsClick(WebElement element) { // JS click
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	public static void jsScrollDown(WebElement element) { // JS Scroll DOWN
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	public static void jsScrollUp(WebElement element) { // JS Scroll UP
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);
	}}