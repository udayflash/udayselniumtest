package seltestng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Redirecturl {
    WebDriver driver;
    @Test
	public void dirurl() throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://test.qount.io");
	    Thread.sleep(4000);
	    driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("udayandeviant@gmail.com");
		driver.findElement(By.id("input__password")).sendKeys("Qount-uday18");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("body > app-root:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > app-side-bar:nth-child(1) > div:nth-child(4) > mat-tab-group:nth-child(1) > div:nth-child(2) > mat-tab-body:nth-child(1) > div:nth-child(1) > div:nth-child(1) > mat-selection-list:nth-child(1) > mat-list-option:nth-child(18) > span:nth-child(1) > span:nth-child(1) > span:nth-child(1)")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-icon[normalize-space()='file_copy']")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[normalize-space()='Archived']")).click();
	    Thread.sleep(2000);
	    Actions actone = new Actions(driver);
	    WebElement orgrow = driver.findElement(By.xpath("//mat-row[@class='mat-mdc-row mdc-data-table__row cdk-row ng-star-inserted'][3]"));
	    actone.moveToElement(orgrow).perform();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//mat-icon[@role='img'][normalize-space()='compare_arrows'])[3]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//span[normalize-space()='Cancel'])")).click();
	    Thread.sleep(2000);
	    actone.moveToElement(orgrow).perform();
	    driver.findElement(By.xpath("(//mat-icon[@role='img'][normalize-space()='bookmarks'])[3]")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//mat-icon[@class='mat-icon notranslate mt-3 material-icons mat-ligature-font mat-icon-no-color']")).click();
	    actone.moveToElement(orgrow).perform();
	    driver.findElement(By.xpath("(//mat-icon[@role='img'][normalize-space()='play_arrow'])[3]")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//input[@placeholder='Search']")).click();
	    driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("1040");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(Keys.ENTER);
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//button[@aria-label='Clear']//span[@class='mat-mdc-button-touch-target']")).click();
	    
    }
}
