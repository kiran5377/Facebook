package sk;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Myown {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver sk = new EdgeDriver();
		sk.manage().window().maximize();
		sk.get("https://www.amazon.in/ref=nav_logo");
		//sk.findElement(By.linkText("text")).click();
		Thread.sleep(4000);
		sk.findElement(By.name("field-keywords")).click();
		Thread.sleep(3000);
		sk.findElement(By.name("field-keywords")).sendKeys("i Phone 15");
		Thread.sleep(2000);
		//sk.findElement(By.name("Go")).click();
		sk.findElement(By.id("nav-search-submit-button")).click();
		sk.findElement(By.name("Apple iPhone 15 (128 GB) - Pink")).click();
		// TODO Auto-generated method stub

	}

}
