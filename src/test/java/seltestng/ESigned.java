package seltestng;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ESigned {
    
	WebDriver driver;
	 @Test 
	public void Signiq() throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://test.qount.io");
		Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));input[placeholder='Username']
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("udayandeviant@gmail.com");
		driver.findElement(By.id("input__password")).sendKeys("Qount-uday18");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(6000);
		driver.findElement(By.cssSelector("body > app-root:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > app-side-bar:nth-child(1) > div:nth-child(4) > mat-tab-group:nth-child(1) > div:nth-child(2) > mat-tab-body:nth-child(1) > div:nth-child(1) > div:nth-child(1) > mat-selection-list:nth-child(1) > mat-list-option:nth-child(15) > span:nth-child(1) > span:nth-child(1) > span:nth-child(1)")).click();
		driver.findElement(By.xpath("//mat-icon[@class='mat-icon notranslate fs-4 mt-1 text-primary material-icons-outlined mat-icon-no-color']")).click();
		driver.findElement(By.xpath("//input[contains(@id,'mat-input-')]")).sendKeys("Automatesign67");
		Thread.sleep(3000);
		//Actions actions = new Actions(driver);
		//actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("Servlet android development").build().perform();
		driver.findElement(By.xpath("//input[@placeholder='Select Client*']")).sendKeys("Mighty enterprises pvt ");
		driver.findElement(By.xpath("//input[@placeholder='Select Client*']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@placeholder='Select Client*']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		JavascriptExecutor kbajs = (JavascriptExecutor) driver;
		kbajs.executeScript("document.getElementById('mat-mdc-slide-toggle-3-button').click()");
		kbajs.executeScript("document.getElementById('mat-mdc-slide-toggle-5-button').click()");
		kbajs.executeScript("document.getElementById('mat-mdc-slide-toggle-7-button').click()");
		kbajs.executeScript("document.getElementById('mat-mdc-slide-toggle-9-button').click()");
		kbajs.executeScript("document.getElementById('mat-mdc-slide-toggle-11-button').click()");
		kbajs.executeScript("document.getElementById('mat-mdc-slide-toggle-8-button').click()");
		kbajs.executeScript("document.getElementById('mat-mdc-slide-toggle-10-button').click()");
		Thread.sleep(2000);
		String docpath = System.getProperty("user.dir");
		driver.findElement(By.id("nativeEsignUpload")).sendKeys(docpath+ "\\uploadpdf\\350KB.pdf");		
		//Actions actions = new Actions(driver);
		//actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.id("mat-select-2")).click();
		driver.findElement(By.cssSelector("#mat-option-1")).click();
		Thread.sleep(2000);
		WebElement markcb = driver.findElement(By.xpath("//label[contains(text(),'Add Invoice')]"));
		markcb.click();
		WebElement markspl = driver.findElement(By.xpath("//label[contains(text(),'Skip & Pay Later')]"));
		markspl.click();
		driver.findElement(By.xpath("//mat-icon[starts-with(@class,'mat-icon notranslate material-icons mat-ligature-font mat-icon-no-color ng-tns-c16-')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Select Item Code']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Select Item Code']")).sendKeys(Keys.ARROW_UP);
		driver.findElement(By.xpath("//input[@placeholder='Select Item Code']")).sendKeys(Keys.ARROW_UP);
		driver.findElement(By.xpath("//input[@placeholder='Select Item Code']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@placeholder='Amount']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Amount']")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("//input[@placeholder='Amount']")).sendKeys(Keys.NUMPAD5);
		driver.findElement(By.xpath("//input[@placeholder='Amount']")).sendKeys(Keys.NUMPAD0);
		driver.findElement(By.xpath("//button[normalize-space()='Next']")).click();
		driver.findElement(By.xpath("//mat-icon[@mattooltip='Pick Notes Template']")).click();
		driver.findElement(By.xpath("//div[@class='mat-mdc-tooltip-trigger badge-menu-item ng-star-inserted'][normalize-space()='8th August']")).click();	
		driver.findElement(By.id("nativePreDocUpload")).sendKeys(docpath+ "\\uploadpdf\\update.pdf");	
	    Thread.sleep(6000);
		driver.findElement(By.xpath("//mat-icon[@mattooltip='Pick Email Template']")).click();
		Thread.sleep(6000);
	    driver.findElement(By.xpath("//span[normalize-space()='8th August']")).click();
//	    driver.findElement(By.xpath("//input[@id='mat-mdc-checkbox-74-input']")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//button[@class='template-submit text-white fs-8 letter-space-initial mt-3 mdc-button mat-mdc-button mat-unthemed mat-mdc-button-base']//span[@class='mdc-button__label']")).click();
	    driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
	    TimeUnit.SECONDS.sleep(30);
	   	WebElement framedoc = driver.findElement(By.xpath("//div[@class='row']//iframe"));
		driver.switchTo().frame(framedoc);
	    driver.findElement(By.xpath("//button[@class='olv-button olv-ignore-transform css-1n4kelk']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[@class='css-102gvct']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@class='css-i4r1gi']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@data-qa='recipient-selector']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@data-qa='recipient-2']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[@class='css-102gvct']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@class='css-i4r1gi']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@class='olv-button olv-ignore-transform css-1n4kelk']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@class='olv-button olv-ignore-transform css-4es3us']")).click();
	 }
}
