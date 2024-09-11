package week4Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class BigBasket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions notification = new ChromeOptions();
		notification.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(notification);
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//span[text()='Category'])[2]")).click();
		Actions mouse = new Actions(driver);
		WebElement food = driver.findElement(By.xpath("(//li/a[@class='CategoryTree___StyledLink-sc-8wbym9-0 gTvqBK'])[16]"));
		mouse.moveToElement(food).perform();
		
		WebElement Rice = driver.findElement(By.xpath("(//li/a[text()='Rice & Rice Products'])[1]"));
		mouse.moveToElement(Rice).perform();
		
		driver.findElement(By.xpath("(//li/a[@class='CategoryTree___StyledLink3-sc-8wbym9-2 kuLxIQ'])[2]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement royal =driver.findElement(By.xpath("//input[@id='i-BBRoyal']"));
		mouse.moveToElement(royal);
		royal.click();
		driver.findElement(By.xpath("//h3[text()='Basmati Rice - Rozana Premium']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowss = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windowss.get(1));
		driver.findElement(By.xpath("(//button[text()='Add to basket'])[1]")).click();
		
		driver.close();
		driver.quit();

	}

}
