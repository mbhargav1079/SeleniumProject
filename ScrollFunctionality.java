package Maven.MvnProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ScrollFunctionality {
	
	WebDriver driver;
    @Test
    public void ByVisibleElement() {
        //System.setProperty("webdriver.chrome.driver", "G://chromedriver.exe");
        driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //Find element by link text and store in variable "Element"        		
        WebElement Element = driver.findElement(By.linkText(""));

        //This will scroll the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", Element);
    }

}
