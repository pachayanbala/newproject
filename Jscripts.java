package org.selinume;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Jscripts {
	
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com//test//drag_drop.html");
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		
		WebElement source1 = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement target1 = driver.findElement(By.xpath("//ol[@align='center'][1]"));
		
		a.dragAndDrop(source1, target1).build().perform();
		
		WebElement source2 = driver.findElement(By.xpath("(//a[contains(text(),'5000')])[2]"));
		WebElement target2 = driver.findElement(By.xpath("//li[@class='placeholder'][1]"));
		
		a.dragAndDrop(source2, target2).build().perform();
		
		WebElement source3 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement target3 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		a.dragAndDrop(source3, target3).build().perform();
		
		WebElement source4 = driver.findElement(By.xpath("(//a[contains(text(),' 5000')])[2]"));
		WebElement target4 = driver.findElement(By.xpath("//li[@class='placeholder']"));
		
		a.dragAndDrop(source4, target4).build().perform();
		
	     WebElement fi = driver.findElement(By.xpath("//a[contains(text(),'Perfect!')]"));
	     a.moveToElement(fi).build().perform();
	}

}
