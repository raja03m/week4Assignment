package week4Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SnapDeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("(//span[@class='catText'])[1]"));
		action.moveToElement(element).perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]")).click();
		String shoeCount = driver.findElement(By.xpath("(//div[@class='child-cat-count '])[2]")).getText();
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		System.out.println(shoeCount);
		driver.findElement(By.xpath("//div[@class='sorting-sec animBounce']")).click();
		WebElement dropdown = driver.findElement(By.xpath("//div[@class='sorting-sec animBounce']/ul/li"));
		action.moveToElement(dropdown).build();
		driver.findElement(By.xpath("//div[@class='sorting-sec animBounce']/ul/li[2]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//input[@name='fromVal']")).clear();
		driver.findElement(By.xpath("//input[@name='fromVal']")).sendKeys("500");
		driver.findElement(By.xpath("//input[@name='toVal']")).clear();
		driver.findElement(By.xpath("//input[@name='toVal']")).sendKeys("500");
		WebElement checkbox = driver.findElement(By.xpath("//label[@for='Color_s-Black']"));
		checkbox.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement element2 = driver.findElement(By.xpath("//p[text()='ASIAN Black Training Shoes']"));
		action.moveToElement(element2).perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("(//div[@class='center quick-view-bar  btn btn-theme-secondary  '])[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		String discountAmount = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		System.out.println(discountAmount);

		
	}

}
