package basepak;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class baseclass {
	public static WebDriver driver;
	public static Properties obj;
  @BeforeMethod
  public void BaseMethod() throws IOException {
	  System.setProperty("wedbriver.chromedriver","C:\\Users\\admin\\eclipse-workspace\\Batch15_basic_maven\\chromedriviver\\chromedriver-win64\\chromedriver.exe");
	   driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  FileInputStream f = new  FileInputStream("C:\\Users\\admin\\eclipse-workspace\\Batch15_basic_maven\\src\\data\\java\\TestDatapak\\my file");
  obj =new Properties();
obj.load(f);
	 System.out.println(obj.getProperty("check")); 
	
  }
}
