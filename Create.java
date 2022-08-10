package org.selinume;

import java.rmi.AccessException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create {
	
	public static void main(String[] args) throws Exception  {
		
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe" );
		ChromeDriver create =new ChromeDriver();
		create.get("https://www.facebook.com/");
		create.manage().window().maximize();
		
		WebElement click = create.findElement(By.xpath(" //a[contains(text(),'Create New Account')]"));
		click.click();
		Thread.sleep(3000);
		
		WebElement name = create.findElement(By.name("firstname"));
		name.sendKeys("pachayan");
		String ate = name.getAttribute("value");
		System.out.println(ate);
		Thread.sleep(2000);
		
		WebElement sname = create.findElement(By.name("lastname"));
		sname.sendKeys("bala");
		
		WebElement email = create.findElement(By.name("reg_email__"));
		email.sendKeys("pasupathi@gamil.com");
		Thread.sleep(2000);
		
		WebElement remail = create.findElement(By.name("reg_email_confirmation__"));
		remail.sendKeys("pasupathi@gamil.com");
		
		WebElement pass = create.findElement(By.id("password_step_input"));
		pass.sendKeys("12345678");
		
		WebElement dob = create.findElement(By.id("day"));
		dob.sendKeys("24");
		
		WebElement month = create.findElement(By.id("month"));
		month.sendKeys("jan");
		
		WebElement year = create.findElement(By.id("year"));
		year.sendKeys("1996");
		
		WebElement gender = create.findElement(By.xpath("(//input[@type='radio'])[2]"));
		gender.click();
		
		
		
		
	}

}
