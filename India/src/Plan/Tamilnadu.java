package Plan;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.handler.codec.http.multipart.FileUpload;

public class Tamilnadu {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gomathi\\eclipse-workspace\\India\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File Sourcefile = ts.getScreenshotAs(OutputType.FILE);
		File targetfile= new File("D:\\gomathi_backup\\takesscreenshot\\gomathi.jpg");
		FileUtils.copyFile(Sourcefile, targetfile);
		
		
		
		
		
	}}
