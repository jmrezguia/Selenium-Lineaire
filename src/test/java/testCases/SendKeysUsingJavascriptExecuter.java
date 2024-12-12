package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysUsingJavascriptExecuter {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		String url = "https://demoqa.com/text-box";
		driver.manage().window().maximize();
	
		driver.get(url);

		WebElement btnClickMe = driver.findElement(By.id("alertButton"));
		btnClickMe.click();

	}

}
