package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchSalesforce {
	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		 driver.get("https://login.salesforce.com/");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		 driver.findElement(By.id("password")).sendKeys("Testleaf$321");
		 driver.findElement(By.name("Login")).click();
		 String title = driver.getTitle();
		 System.out.println(title);
		 
	}

}
