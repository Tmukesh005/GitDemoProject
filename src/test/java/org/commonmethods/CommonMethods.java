package org.commonmethods;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonMethods {
	
	public static WebDriver driver=null;
	@Before
	public static WebDriver bLaunch() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	

	}
	public static void url(String url) {
		driver.get(url);
	}
	
	public static void typeData(WebElement element, String value) {
		element.sendKeys(value);
	}
	public static void clickLogin(WebElement element) {
		element.click();
	}
	
	public static void cLaunch() {
		driver.close();
	}

}
