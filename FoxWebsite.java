package Maven.MvnProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FoxWebsite {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		//initiating FF 
		driver=  new FirefoxDriver();
		driver.get("www.fox.com");
		
		//Creating Signup
		driver.findElement(By.id("path-1")).click();
		driver.findElement(By.xpath("//button[@class='Account_signUp_3SpTs']")).click();
		driver.findElement(By.xpath("//input[@name='signupFirstName']")).sendKeys("Bhargav");
		driver.findElement(By.xpath("//input[@name='signupLastName']")).sendKeys("V");
		driver.findElement(By.xpath("//input[@name='signupEmail']")).sendKeys("");
		driver.findElement(By.xpath("//input[@name='signupPassword']")).sendKeys("");
		Select gender= new Select(driver.findElement(By.xpath("//span[@class='DropdownIcon_icon_uQQ6E DropdownIcon_iconDown_btZKM']")));
		gender.selectByVisibleText("Male");
		driver.findElement(By.xpath("//input[@placeholder='Birthdate']")).sendKeys("");
		driver.findElement(By.xpath("//div[@class='Account_signupButtonDesktop_1PCXs']")).click();
		driver.findElement(By.xpath("//div[@class='Account_signupSuccessButton_1mM7y']")).click();
		
		//SigningIn
		driver.get("www.fox.com");
		driver.findElement(By.id("path-1")).click();
		driver.findElement(By.xpath("//button[@class='Account_signIn_Q0B7n']")).click();
		driver.findElement(By.xpath("//input[@name='signinEmail']")).sendKeys("m.bhargav1079@gmail.com");
		driver.findElement(By.xpath("//input[@name='signinPassword']")).sendKeys("test1234");
		driver.findElement(By.xpath("//div[@class='Account_signinButtonDesktop_2SO1g']")).click();
		
		//Navigating to shows
		driver.findElement(By.xpath("//a[@href='/shows']")).click();
		driver.findElement(By.linkText("FOX")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.linkText("Linux"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		
		//Navigation to FX
		
		driver.findElement(By.xpath("//a[@href='/shows']")).click();
		driver.findElement(By.linkText("FX")).click();
		
		//Navigation to National Geographic
		driver.findElement(By.xpath("//a[@href='/shows']")).click();
		driver.findElement(By.linkText("National Geographic")).click();
		
		//Navigation to FOX Sports
		driver.findElement(By.xpath("//a[@href='/shows']")).click();
		driver.findElement(By.linkText("FOX Sports")).click();
		
		//Navigation to All Shows
		driver.findElement(By.xpath("//a[@href='/shows']")).click();
		driver.findElement(By.linkText("All Shows")).click();
		
		
		
		
		
		
		
		

}}

