package testCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo {

	public static void main(String[] args) {
		// Open chrome browser
				WebDriver driver = new ChromeDriver();
				
				// Maximize browser
				driver.manage().window().maximize();
										
			   // Open NopCommerce Application
				driver.get("https://demoqa.com/buttons");
			
				// Instantiate Action class
				Actions action = new Actions(driver);
				
				// Retrieve webelement to perform Right click
				WebElement btnRightClick = driver.findElement(By.id("rightClickBtn"));
				action.contextClick(btnRightClick).perform();
				System.out.println("button is Right clicked");
			
				// Checking message display
				String messageRightClick = driver.findElement(By.id("rightClickBtn")).getText();
				Assert.assertEquals(messageRightClick,"You have done a Right click");
				
				driver.quit();
				
	}

}
