package week4Assignment;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTable {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://finance.yahoo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		Actions action =new Actions(driver);
		
		driver.findElement(By.xpath("//input[@id='ybar-sbq']")).sendKeys("Crypto");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.findElement(By.xpath("//strong[text()='Crypto']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		int row = driver.findElements(By.xpath("//table[@class='markets-table freeze-col yf-42jv6g fixedLayout']/tbody/tr")).size();
		for (int i = 0; i < row; i++) {
			String crypto = driver.findElement(By.xpath("//table[@class='markets-table freeze-col yf-42jv6g fixedLayout']/tbody/tr["+i+"]/td[1]")).getText();
			System.out.println(crypto);
			
		}
		
		
		
		
		
	}

}
