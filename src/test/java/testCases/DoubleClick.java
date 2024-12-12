package testCases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		
		// Open chrome browser
		WebDriver driver = new ChromeDriver();
		
		// Maximize browser
		driver.manage().window().maximize();
								
	   // Open NopCommerce Application
		driver.get("https://demoqa.com/buttons");
	
		// Instantiate Action class
		Actions action = new Actions(driver);
		
		// Retrieve webelement to perform double click
		WebElement btnDoubleClick = driver.findElement(By.id("doubleClickBtn"));
		action.doubleClick(btnDoubleClick).perform();
		System.out.println("button is double clicked");
	
		// Checking message display
		String messageDoubleClick = driver.findElement(By.id("doubleClickBtn")).getText();
		Assert.assertEquals(messageDoubleClick,"You have done a double click");
		
		//driver.quit();
		
		
	}

}
