package Testpak;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class Coding extends ReuseMethod {
     public void login() {
	 driver.get(obj.getProperty("URL"));
	XP("XU").sendKeys(obj.getProperty("U"));
	  XP("XP").sendKeys(obj.getProperty("P"));
	  XP("XL").click();
	
     }
     public void oneemp() throws InterruptedException, AWTException
     {
    	 y(2);
    
    	Actions a=new Actions(driver);
    	a.moveToElement(XP("XPIM")).perform();
    	y(1);
    	XP("XADD").click();
    	driver.switchTo().frame(XP("XFRAME"));
    	y(2);
    	XP("XID").clear();
    	y(2);
    	XP("XID").sendKeys("488");
    	XP("XLAST").sendKeys("aravindu");
    	XP("XFIRST").sendKeys("chinna");
    	XP("XMIDLE").sendKeys("chitra");
    	XP("XNICK").sendKeys("paka");
    	
      a.moveToElement(XP("XPHOTO")).click().perform();
      StringSelection S = new StringSelection("C:\\Users\\admin\\Pictures\\shiva.jpg");
      Toolkit.getDefaultToolkit().getSystemClipboard().setContents(S, null);
       y(2);
       Robot r=new Robot();
       r.keyPress(KeyEvent.VK_CONTROL);
       r.keyPress(KeyEvent.VK_V);
       r.keyRelease(KeyEvent.VK_CONTROL);
       r.keyRelease(KeyEvent.VK_V);
       r.keyPress(KeyEvent.VK_ENTER);
       r.keyRelease(KeyEvent.VK_ENTER);
       y(2);
       XP("XSAVE").click();
       y(1);                                                   
       driver.switchTo().defaultContent();
    	y(1);
    //	XP("XBACK").click();
    	a.moveToElement(XP("XPIM")).click().perform();
    	// driver.get(obj.getProperty("XPEMP"));
         driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"standardView\"]/table")));
    	
    	//	driver.switchTo().frame(drier.findElement(By.className("data-table")));
    	y(1);
    	// driver.findElement(By.xpath("//*[@id=\"standardView\"]/table/tbody/tr[5]/td[3]/a")).click();
    	 XP("XCL").click();
    	//a.moveToElement( (obj.get("XPEMP")).perform(); 
     }
     
     
     public void oneempexcel() throws InterruptedException, AWTException, IOException
     {
    	 FileInputStream fil = new FileInputStream("C:\\Users\\admin\\Downloads\\orangeHram_xls.xlsx");
    	 XSSFWorkbook Wk =new XSSFWorkbook(fil);
    	 XSSFSheet sh=Wk.getSheet("Employee_data");
    	 for (int i=1;i<=sh.getLastRowNum();i++)
    	 {
    	 
    	int id = (int) sh.getRow(1).getCell(0).getNumericCellValue();
    	 String LN =sh.getRow(1).getCell(1).getStringCellValue();
    	 
    	 String FN =sh.getRow(1).getCell(2).getStringCellValue();
    	 String MN =sh.getRow(1).getCell(3).getStringCellValue();
    	 String NN =sh.getRow(1).getCell(4).getStringCellValue();
    	 
    	 y(2);
    
    	Actions a=new Actions(driver);
    	a.moveToElement(XP("XPIM")).perform();
    	y(1);
    	XP("XADD").click();
    	driver.switchTo().frame(XP("XFRAME"));
    	y(2);
    	XP("XID").clear();
    	y(2);
    	XP("XID").sendKeys(String.valueOf(id));
    	XP("XLAST").sendKeys(LN);
    	XP("XFIRST").sendKeys(FN);
    	XP("XMIDLE").sendKeys(MN);
    	XP("XNICK").sendKeys(NN);
    	
      a.moveToElement(XP("XPHOTO")).click().perform();
      StringSelection S = new StringSelection("C:\\Users\\admin\\Pictures\\shiva.jpg");
      Toolkit.getDefaultToolkit().getSystemClipboard().setContents(S, null);
       y(2);
       Robot r=new Robot();
       r.keyPress(KeyEvent.VK_CONTROL);
       r.keyPress(KeyEvent.VK_V);
       r.keyRelease(KeyEvent.VK_CONTROL);
       r.keyRelease(KeyEvent.VK_V);
       r.keyPress(KeyEvent.VK_ENTER);
       r.keyRelease(KeyEvent.VK_ENTER);
       y(2);
       XP("XSAVE").click();
       y(1);
       driver.switchTo().defaultContent();
    	y(1);
    //	XP("XBACK").click();
    	a.moveToElement(XP("XPIM")).click().perform();
    	y(1);
    	 }
    	 }
    	
    	 public void multiempexcel() throws InterruptedException, AWTException, IOException
         {
        	 FileInputStream fil = new FileInputStream("C:\\Users\\admin\\Downloads\\orangeHram_xls.xlsx");
        	 XSSFWorkbook Wk =new XSSFWorkbook(fil);
        	 XSSFSheet sh=Wk.getSheet("Employee_data");
        	 for (int i=1;i<=sh.getLastRowNum();i++)
        	 {
        	 
        	int id = (int) sh.getRow(i).getCell(0).getNumericCellValue();
        	 String LN =sh.getRow(i).getCell(1).getStringCellValue();
        	 
        	 String FN =sh.getRow(i).getCell(2).getStringCellValue();
        	 String MN =sh.getRow(i).getCell(3).getStringCellValue();
        	 String NN =sh.getRow(i).getCell(4).getStringCellValue();
        	 
        	 y(2);
        
        	Actions a=new Actions(driver);
        	a.moveToElement(XP("XPIM")).perform();
        	y(1);
        	XP("XADD").click();
        	driver.switchTo().frame(XP("XFRAME"));
        	y(2);
        	XP("XID").clear();
        	y(2);
        	XP("XID").sendKeys(String.valueOf(id));
        	XP("XLAST").sendKeys(LN);
        	XP("XFIRST").sendKeys(FN);
        	XP("XMIDLE").sendKeys(MN);
        	XP("XNICK").sendKeys(NN);
        	
          a.moveToElement(XP("XPHOTO")).click().perform();
          StringSelection S = new StringSelection("C:\\Users\\admin\\Pictures\\shiva.jpg");
          Toolkit.getDefaultToolkit().getSystemClipboard().setContents(S, null);
           y(2);
           Robot r=new Robot();
           r.keyPress(KeyEvent.VK_CONTROL);
           r.keyPress(KeyEvent.VK_V);
           r.keyRelease(KeyEvent.VK_CONTROL);
           r.keyRelease(KeyEvent.VK_V);
           r.keyPress(KeyEvent.VK_ENTER);
           r.keyRelease(KeyEvent.VK_ENTER);
           y(2);
           XP("XSAVE").click();
           y(1);
           driver.switchTo().defaultContent();
        	y(1);
        //	XP("XBACK").click();
        	a.moveToElement(XP("XPIM")).click().perform();
        	y(1);
        	 }
        	 }
        	 
        	 public void multiempphotoexcel() throws InterruptedException, AWTException, IOException
             {
            	 FileInputStream fil = new FileInputStream("C:\\Users\\admin\\Downloads\\orangeHram_xls.xlsx");
            	 XSSFWorkbook Wk =new XSSFWorkbook(fil);
            	 XSSFSheet sh=Wk.getSheet("Employee_data");
            	 for (int i=1;i<=sh.getLastRowNum();i++)
            	 {
            	 
            	int id = (int) sh.getRow(i).getCell(0).getNumericCellValue();
            	 String LN =sh.getRow(i).getCell(1).getStringCellValue();
            	 
            	 String FN =sh.getRow(i).getCell(2).getStringCellValue();
            	 String MN =sh.getRow(i).getCell(3).getStringCellValue();
            	 String NN =sh.getRow(i).getCell(4).getStringCellValue();
            	 
            	 y(2);
            
            	Actions a=new Actions(driver);
            	a.moveToElement(XP("XPIM")).perform();
            	y(1);
            	XP("XADD").click();
            	driver.switchTo().frame(XP("XFRAME"));
            	y(2);
            	scrn(FN+"Before Adding");
                      	
            	XP("XID").clear();
            	y(2);
            	XP("XID").sendKeys(String.valueOf(id));
            	XP("XLAST").sendKeys(LN);
            	XP("XFIRST").sendKeys(FN);
            	XP("XMIDLE").sendKeys(MN);
            	XP("XNICK").sendKeys(NN);
            	
              a.moveToElement(XP("XPHOTO")).click().perform();
              StringSelection S = new StringSelection("C:\\Users\\admin\\eclipse-workspace\\Batch15_basic_maven\\src\\data\\java\\TestDatapak\\Employee_photo\\shiva.jpg"+FN+".jpg");
              Toolkit.getDefaultToolkit().getSystemClipboard().setContents(S, null);
               y(2);
               Robot r=new Robot();
               r.keyPress(KeyEvent.VK_CONTROL);
               r.keyPress(KeyEvent.VK_V);
               r.keyRelease(KeyEvent.VK_CONTROL);
               r.keyRelease(KeyEvent.VK_V);
               r.keyPress(KeyEvent.VK_ENTER);
               r.keyRelease(KeyEvent.VK_ENTER);
               y(2);
               XP("XSAVE").click();
               y(1);
           	scrn(FN+" after save");
             driver.switchTo().defaultContent();
            	y(1);
            //	XP("XBACK").click();
            	a.moveToElement(XP("XPIM")).click().perform();
            	y(1);
	       scrn(FN);
	       
	          
            	
	             	y(2);
            	scrn(FN+"added");            	
            	
            	//System.out.println(sh);
            	 }
            	 
            	 
     }
     }
     
