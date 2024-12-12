package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSwitchCommand {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		String url = "https://www.guru99.com/live-selenium-project.html";
		driver.get(url);
		driver.manage().window().maximize();

		driver.get(url);
		driver.switchTo().frame("a077aa5e");
		WebElement Iframebtn = driver.findElement(By.xpath("html/body/a/img"));
		System.out.println("we are switch to the Iframe");
		
		Iframebtn.click();
		System.out.println("we are done");
		
		driver.close();
	}

}
