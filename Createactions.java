package org.selinume;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Createactions {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
    	WebDriver driver =  new ChromeDriver();
    	driver.get("https://www.facebook.com/");
    	driver.manage().window().maximize();
    	
    	Actions a = new Actions(driver);
    	
    	WebElement mail = driver.findElement(By.name("email"));
        a.sendKeys(mail, "karthi").build().perform();
        
    	WebElement pass = driver.findElement(By.name("pass"));
    	a.sendKeys(pass, "123445").build().perform();
    	
    	WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
    	a.click(login).build().perform();
    	
    	WebElement fb = driver.findElement(By.xpath("//div[contains(text(),'Log in to Facebook')]"));
    	a.doubleClick(fb).build().perform();
    	
    	a.contextClick(fb).build().perform();
    	
    	Robot r = new Robot();
    	
    	WebElement log = driver.findElement(By.xpath("//div[contains(text(),'Log in to Facebook')]"));
    	a.doubleClick(log).build().perform();
    	
    	a.contextClick(log).build().perform();
    	
    	r.keyPress(KeyEvent.VK_DOWN);
    	Thread.sleep(3000);
    	r.keyRelease(KeyEvent.VK_DOWN);
    	
    	r.keyPress(KeyEvent.VK_ENTER);
    	Thread.sleep(3000);
    	r.keyRelease(KeyEvent.VK_ENTER);
    	Thread.sleep(3000);
    	
    	WebElement ft = driver.findElement(By.id("email_container"));
    	a.doubleClick(ft).build().perform();
    	
    	
    	a.contextClick(ft).build().perform();
    	
    	r.keyPress(KeyEvent.VK_DOWN);
    	Thread.sleep(3000);
    	r.keyPress(KeyEvent.VK_DOWN);
    	Thread.sleep(3000);
    	r.keyPress(KeyEvent.VK_DOWN);
    	Thread.sleep(3000);
    	r.keyPress(KeyEvent.VK_DOWN);
    	Thread.sleep(3000);
    	
    	Thread.sleep(3000);
    	r.keyPress(KeyEvent.VK_DOWN);
    	Thread.sleep(3000);
    	r.keyPress(KeyEvent.VK_DOWN);
    	Thread.sleep(3000);
    	r.keyPress(KeyEvent.VK_DOWN);
    	Thread.sleep(3000);
    	r.keyPress(KeyEvent.VK_DOWN);
    	Thread.sleep(3000);
    	r.keyPress(KeyEvent.VK_DOWN);
    	Thread.sleep(3000);
    	r.keyPress(KeyEvent.VK_DOWN);
    	Thread.sleep(3000);
    	r.keyPress(KeyEvent.VK_ENTER);
    	Thread.sleep(3000);
    	r.keyRelease(KeyEvent.VK_ENTER);
    	Thread.sleep(3000);
    	
    	WebElement forg = driver.findElement(By.xpath("(//a[contains(text(),'Forgotten password?')])[2]"));
    
    	a.moveToElement(forg).build().perform();
    	
    	
    	
	}

}
