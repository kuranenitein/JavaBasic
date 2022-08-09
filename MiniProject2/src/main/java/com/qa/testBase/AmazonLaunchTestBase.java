package com.qa.testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.pagelayer.Homepage;



public class AmazonLaunchTestBase {
	public static WebDriver driver;
	 public Homepage h;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\Automation Testing\\Setup files\\chromedriver_win32 (1)\\chromedriver.exe");
		
		driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.amazon.in");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    h=new Homepage();
	    }
	@AfterMethod
	public void close()
	{
		driver.close();
	}


}
