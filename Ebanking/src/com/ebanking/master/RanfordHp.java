package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RanfordHp 
{

	//Element Properties
	
	@FindBy(id="txtuId")
	WebElement Uname;
	
	@FindBy(id="txtPword")
	WebElement Pswd;
	
	@FindBy(xpath="//*[@id=\"login\"]")
    WebElement Lgn;
	
	
	//Element Methods
	
	public void login(String Una,String Pd)
	{
		Uname.sendKeys(Una);
		Pswd.sendKeys(Pd);
		Lgn.click();
		
	}
	
	
	
}
