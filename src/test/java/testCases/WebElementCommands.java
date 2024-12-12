package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(url);
		driver.manage().window().maximize();

		WebElement Username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		WebElement Password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		WebElement btnLogin = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		
		Username.clear();
		Username.sendKeys("Admin");
		
		Password.clear();
		Password.sendKeys(" admin123");
		
		
		btnLogin.click();
		
		//Value attribue Name
		
		
		btnClickMe.click();
	}

}
