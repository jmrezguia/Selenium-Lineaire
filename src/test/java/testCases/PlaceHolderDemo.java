package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlaceHolderDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		String url = "https://demoqa.com/tool-tips/";
		driver.get(url);
		driver.manage().window().maximize();

		WebElement placeHolderBtn = driver.findElement(By.id("toolTipTextField"));
		String textPlaceHolder = placeHolderBtn.getAttribute(url)
		btnClickMe.click();
	}

}
