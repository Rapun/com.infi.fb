package com.infi.fb.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FB {
	
	WebDriver driver;

	@BeforeTest
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://www.fb.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	@Test
	public void Verifyurl()
	{
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.facebook.com/");
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
	
	//single class using testng
	// suite file running using testng
	//maven pom.xml run    ----> maven surefire , maven complier 
	// command prompt 
	// batch file 
	//jenkins 
	//git, github 

}
