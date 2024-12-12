package testCases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {

		// Open chrome browser
		WebDriver driver = new ChromeDriver();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));//Declaration de variable (wait)
		
		//Delet Cookies
		driver.manage().deleteAllCookies();
		
		// Maximize browser
		driver.manage().window().maximize();

		//Wait 3 sec
		Thread.sleep(3000);

		// Open NopCommerce Application
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		//Clear Email Field
		driver.findElement(By.id("Email")).clear();

		//Fill Email
		driver.findElement(By.id("Email")).sendKeys(" admin@yourstore.com");

		//Clear PassWord Field
		driver.findElement(By.id("Password")).clear();

		//Fill PassWord
		driver.findElement(By.id("Password")).sendKeys(" admin");

		//Click On Login Button
		driver.findElement(By.xpath("//Button[@type = 'submit']")).click();
		
		//Click a login button using explicit wait
		WebElement btnlogin;
		btnlogin = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
		btnlogin.click();
		//Print a log in message in the screen
		System.out.println("Succesfully Authentication");

		//Close Browser
		//driver.close();

		driver.quit();//Kill session




		//driver.quit();


	}

}
