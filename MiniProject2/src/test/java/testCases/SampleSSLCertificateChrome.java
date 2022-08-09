package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SampleSSLCertificateChrome {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "E:\\Testing\\Automation Testing\\Setup files\\chromedriver_win32 (1)\\chromedriver.exe");
         
		  ChromeOptions handlesslerr=new ChromeOptions();
		  handlesslerr.setAcceptInsecureCerts(true);
		  
		  WebDriver driver=new ChromeDriver(handlesslerr);
		
         driver.manage().window().maximize();
         driver.get("https:\\www.google.com");
          
         //driver.manage().window().setPosition(new Point(-2000, 0));
         driver.findElement(By.name("q")).sendKeys("kuranenitein");;
         Actions a=new Actions(driver);
         a.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).build().perform();
         
         a.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).build().perform();
         a.sendKeys(Keys.SPACE).build().perform();
         a.keyDown(Keys.CONTROL).sendKeys("V").build().perform();
         a.keyDown(Keys.ENTER).build().perform();
         }

}
