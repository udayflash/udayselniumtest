package seltestng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ESignsync {
	WebDriver driver;
	public ESignsync() {
	driver = new ChromeDriver();	
	}
	@AfterMethod
	public void quitio() {
	driver.quit();
	}
	@BeforeMethod
	public void LoginQtio() throws InterruptedException {
	driver.manage().window().maximize();
	driver.get("https://test.qount.io");
	Thread.sleep(4000);
	driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("udayandeviant@gmail.com");
	driver.findElement(By.id("input__password")).sendKeys("Qount-uday18");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(5000);
	driver.findElement(By.cssSelector("body > app-root:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > app-side-bar:nth-child(1) > div:nth-child(4) > mat-tab-group:nth-child(1) > div:nth-child(2) > mat-tab-body:nth-child(1) > div:nth-child(1) > div:nth-child(1) > mat-selection-list:nth-child(1) > mat-list-option:nth-child(15) > span:nth-child(1) > span:nth-child(1) > span:nth-child(1)")).click();
	Thread.sleep(4000);
	}
	@Test
	public void Syncesign() throws InterruptedException {
	WebElement iscroll = driver.findElement(By.xpath("(//mat-icon[@role='img'][normalize-space()='more_vert'])[2]"));
	JavascriptExecutor Jscr = (JavascriptExecutor) driver;
	Jscr.executeScript("arguments[0].scrollIntoView(true);" ,iscroll);
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//mat-icon[@role='img'][normalize-space()='more_vert'])[10]")).click();
	//driver.findElement(By.xpath("//div[@class='g-table']//mat-icon[@role='img'][normalize-space()='more_vert'][normalize-space()='Prosignbug']")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("//span[@class='mdc-list-item__primary-text']//span[normalize-space()='Sync']")).click();
	}
}
