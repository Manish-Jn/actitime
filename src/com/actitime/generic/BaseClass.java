
package com.actitime.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static WebDriver driver;
	@BeforeClass
	public void OpenBrowser() {
	Reporter.log("OPenBrowser",true);
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



	}
	@AfterClass
	public void closeBrowser() {
		Reporter.log("CloseBrowser",true);
		driver.close();
		
		
	}
	@BeforeMethod
	public void Login() throws IOException {
		Reporter.log("Login",true);
		FileInputStream fis=new FileInputStream("./Data/CommonData.property");
		Properties p=new Properties();
		p.load(fis);
		driver.get(p.getProperty("url"));
		driver.findElement(By.id("username")).sendKeys(p.getProperty("username"));
		driver.findElement(By.name("pwd")).sendKeys(p.getProperty("password"));
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		
	}
	@AfterMethod
	public void logout() {
		Reporter.log("Logout",true);
		driver.findElement(By.id("logoutLink")).click();
		
	}
	}


