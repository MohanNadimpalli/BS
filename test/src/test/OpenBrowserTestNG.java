package test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class OpenBrowserTestNG {
	
	ChromeDriver driver = null;
	
@BeforeTest
	public void main() {

		System.setProperty("webdriver.chrome.driver", "D:\\Users\\mnadimpalli\\Desktop\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
	}
@Test(priority=1)
public void HomePageValidation() {
	driver.get("https://nztraining.usedirect.com/NewZealandHCTestSaturnV2/");
	driver.manage().window().maximize();
	driver.findElementByXPath("//img[contains(@src,'A_logo.png')]").isDisplayed();
	driver.findElementByXPath("//a[text()='HOME']").isDisplayed();
	driver.findElementByXPath("//a[text()='Accommodation']").isDisplayed();
	driver.findElementByXPath("//div[@id='navbar-collapse']//a[text()='PASSES']").isDisplayed();
	driver.findElementByXPath("//Span[text()='LOGIN']").isDisplayed();
	//driver.findElementByXPath("//Span[text()='CREATE ACCOUNT']").isDisplayed();
	
}

/*
@Test(priority=2)

public void CreateAccountErrorMessage() {
	
	driver.findElementByXPath("//Span[text()='CREATE ACCOUNT']").click();
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	driver.findElementByXPath("//input[@value='Create Account']").click();
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	String SystemMessage = driver.findElementByXPath("//*[@id=\"divmodalbodyMSG\"]").getText();
	System.out.println(SystemMessage);
	driver.getWindowHandles();
	//driver.switchTo().window(windowid)
	driver.findElementByXPath("//span[@class='closepopup']").click();
} */


@Test(priority=3)

public void CreateAccount() {
	
	driver.findElementByXPath("//Span[text()='CREATE ACCOUNT']").click();
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	
}

/*
@AfterTest
public void endtest() {
	driver.quit();
} */
}
