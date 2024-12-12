package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		String url = "https://demo.guru99.com/test/upload/";
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement btnUpload = driver.findElement(By.id("uploadfile_0"));
		btnUpload.sendKeys("C:\\Users\\jihen\\Downloads\\pexels-photo-8821945.jpeg");
		
		driver.quit();
	}

}
