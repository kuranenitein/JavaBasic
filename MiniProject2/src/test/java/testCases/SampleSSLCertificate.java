package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class SampleSSLCertificate {

	public static void main(String[] args) {
		 System.setProperty("webdriver.gecko.driver", "E:\\Testing\\Automation Testing\\Setup files\\geckodriver-v0.31.0-win64\\geckodriver.exe");
         
		 //handle ssl certificate error
		 
		 ProfilesIni profile= new ProfilesIni();
		 FirefoxProfile ffProfile=profile.getProfile("SeleniumTest");
		 ffProfile.setAcceptUntrustedCertificates(true);
		 ffProfile.setAssumeUntrustedCertificateIssuer(false);
		 
		 WebDriver driver=new FirefoxDriver(ffProfile);
         driver.manage().window().maximize();
         driver.get("https:\\www.google.com");
	}

}
