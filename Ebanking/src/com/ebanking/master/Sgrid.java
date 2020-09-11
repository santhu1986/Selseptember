package com.ebanking.master;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Sgrid 
{

	DesiredCapabilities Cap=null;
	@Parameters("Browser")
	@Test
	public void gd(String Br) throws MalformedURLException, InterruptedException 
	{
		
		if (Br.equalsIgnoreCase("firefox"))
		{
			Cap=new DesiredCapabilities();
			  Cap.setBrowserName("firefox");
			  Cap.setPlatform(Platform.WINDOWS);
	}

		else if (Br.equalsIgnoreCase("chrome"))
		{
			Cap=new DesiredCapabilities();
			  Cap.setBrowserName("chrome");
			  Cap.setPlatform(Platform.WINDOWS);
			  	
		}
	 RemoteWebDriver driver=new RemoteWebDriver(new URL("http://192.168.0.106:4444/wd/hub"),Cap);
	 
	 driver.manage().window().maximize();
		driver.get("http://183.82.100.55/ranford2");
		Thread.sleep(3000);
		RanfordHp RHP=PageFactory.initElements(driver,RanfordHp.class);	
		RHP.login("Admin","M1ndq");
    Thread.sleep(3000);
		AdminHp AHP=PageFactory.initElements(driver,AdminHp.class);
		AHP.Rol();
  
		
	}
}
