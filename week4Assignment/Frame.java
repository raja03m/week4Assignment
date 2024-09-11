package week4Assignment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.switchTo().frame(0);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Raja");
		alert.accept();
	}

}
