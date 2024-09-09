package Testpak;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import basepak.baseclass;

public class TestcasesExecuted extends baseclass {
  @Test
  public void Testcases() throws InterruptedException, AWTException, IOException {
	  
	  Coding c =new Coding();
	  c.login();
      c.oneemp();
//	  //c.oneempexcel();
 //c.multiempexcel();
//	  c.multiempphotoexcel();  
	 
  
  
  
  }
}
