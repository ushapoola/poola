package Testpak;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class ReuseMethod extends TestcasesExecuted {
	public WebElement XP(String a)
	{
	return driver.findElement(By.xpath(obj.getProperty(a)));
		
	}
	public void y(int a) throws InterruptedException
	{
		int x=a*1000;
	    Thread.sleep(x); 
		
	}
	public void scrn(String v) throws IOException
	{
	 File S=   ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 File T =  new File("C:\\Users\\admin\\eclipse-workspace\\Batch15_basic_maven\\Test_Evidences\\"+v+".jpg");
	 FileHandler.copy(S, T); 
	} 
	
	

}
