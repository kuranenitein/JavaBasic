package com.qa.pagelayer;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.testBase.AmazonLaunchTestBase;

public class Homepage extends AmazonLaunchTestBase {
	
	public Homepage() {
		 PageFactory.initElements(driver,this);
		 }
	
	@FindBy(xpath="//a[@id='nav-logo-sprites']")
	private WebElement logo;	
	 
	@FindBy(xpath="//a[text()=' Electronics ']")
	private WebElement link;
	
	
	 
	public void logoDispay() {
		 boolean b=logo.isDisplayed();
		 System.out.println(b);		 
	 }
	
	public void linkClickable() 
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(link));
		link.click();
	}
	 
	 
}
