package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardEvents {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		String url = "https://demoqa.com/text-box";
		driver.get(url);
		driver.manage().window().maximize();

		WebElement FullName = driver.findElement(By.id("userName"));
		WebElement Email = driver.findElement(By.id("userEmail"));
		WebElement CurrentAdress = driver.findElement(By.id("currentAddress"));
		WebElement PermanentAdress = driver.findElement(By.id("permanentAddress"));

		FullName.sendKeys("Jihen mrezguia");
		Email.sendKeys("jihen.mrezguia@gmail.com");
		CurrentAdress.sendKeys("6 rue de la bourie blanche 4500 orléans");

		CurrentAdress.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		CurrentAdress.sendKeys(Keys.chord(Keys.CONTROL, "c"));

		PermanentAdress.sendKeys(Keys.chord(Keys.CONTROL, "v"));

		// JavaScript executer click on submit button
		WebElement btnSubmit = driver.findElement(By.id("submit"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", btnSubmit);

		// driver.quit();
	}

}
