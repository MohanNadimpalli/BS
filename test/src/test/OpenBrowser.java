package test;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver", "D:\\Users\\mnadimpalli\\Desktop\\Selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://nztraining.usedirect.com/NewZealandHCTestSaturnV2/");
		driver.manage().window().maximize();
		/* Verify top navigation */
		driver.findElementByXPath("//img[contains(@src,'A_logo.png')]").isDisplayed();
		driver.findElementByXPath("//a[text()='HOME']").isDisplayed();
		driver.findElementByXPath("//a[text()='Accommodation']").isDisplayed();
		driver.findElementByXPath("//div[@id='navbar-collapse']//a[text()='PASSES']").isDisplayed();
		driver.findElementByXPath("//Span[text()='LOGIN']").isDisplayed();
		driver.findElementByXPath("//Span[text()='CREATE ACCOUNT']").isDisplayed();
		
		driver.close();

	}

}
