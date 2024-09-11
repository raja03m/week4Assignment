package week4Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {

	public static void main(String[] args) {
		ChromeOptions notification = new ChromeOptions();
		notification.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(notification);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(Keys.ENTER);
		String firstAmount = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println(firstAmount);

		String reviewCount = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]"))
				.getText();
		System.out.println(reviewCount);
		driver.findElement(By.xpath("(//span[@class='a-button a-button-base'])[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		String finalAmount = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
		String k = finalAmount.replaceAll("₹", "");
		String[] x = k.split(".00");
		String finalAmountx = x[0];
		if (finalAmountx.equals(firstAmount))
			System.out.println("Its same amount ");
		else
			System.out.println("Its different amount");

	}

}
