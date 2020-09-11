package com.ebanking.master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Exepom 
{
	
	WebDriver driver;
	
     @BeforeTest
	public void launch()
	{
		driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("http://183.82.100.55/ranford2");
	}
     @Test
     public void login() 
     {
    	 
	RanfordHp RHP=PageFactory.initElements(driver,RanfordHp.class);	
		RHP.login("Admin","M1ndq");
     }
     @AfterTest
     public void Role()
     {
    	 
		AdminHp AHP=PageFactory.initElements(driver,AdminHp.class);
		AHP.Rol();
	}
}
