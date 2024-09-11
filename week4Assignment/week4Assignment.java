package week4Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class week4Assignment {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> w = new ArrayList<String>(windowHandles);
		driver.switchTo().window(w.get(1));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//a[text()='DemoCustomer']")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> w2 = new ArrayList<String>(windowHandles2);
		driver.switchTo().window(w2.get(0));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> windowHandles3 = driver.getWindowHandles();
		List<String> w3 = new ArrayList<String>(windowHandles3);
		driver.switchTo().window(w3.get(1));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//a[text()='dp1a1contact2']")).click();
		Set<String> windowHandles4 = driver.getWindowHandles();
		List<String> w4 = new ArrayList<String>(windowHandles4);
		driver.switchTo().window(w4.get(0));
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		Alert a = driver.switchTo().alert();
		a.accept();
		

		
		
	}

}
