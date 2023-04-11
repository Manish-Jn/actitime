package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(name="username")
	private WebElement untbx; 
	
	@FindBy(name="pwd")
	private WebElement pastbx;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement Logbtn;
	
	
	public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	public void Setter(String un,String ps)
	{
		untbx.sendKeys(un);
		pastbx.sendKeys(ps);
		Logbtn.click();
		
	}

}
