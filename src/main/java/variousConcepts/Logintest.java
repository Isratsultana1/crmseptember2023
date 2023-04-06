package variousConcepts;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;        
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class Logintest {
        WebDriver driver;
	@Before
     public void init() {
 System.setProperty("webdriver.chrome.driver","C:\\Users\\israt\\Sep2023_Selenium\\crm1\\driver\\chromedriver.exe");
  driver = new ChromeDriver();
 driver.manage().deleteAllCookies(); 
 driver.get("http://techfios.com/test/109/");	
	}
     @Test
     public void logintest() {	
    	 
    	 driver.findElement(By.xpath("/html/body/div[3]/input[3]")) ; 
	   By ToggleAll = By.xpath("/html/body/div[3]/input[3]");
       driver.findElement(ToggleAll).click();
     Assert.assertTrue("All box isnot checked!!",driver.findElement(ToggleAll).isDisplayed());
     driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
     }
//     using css selector to validating that a single list item could be removed
     @Test
     public void checkbox1() {
     driver.findElement(By.xpath("/html/body/div[4]/input[2]")).sendKeys("israt");
     driver.findElement(By.xpath("/html/body/div[4]/input[2]")).click();
     driver.findElement(By.xpath("/html/body/div[4]/input[2]")).sendKeys("israt2");
     driver.findElement(By.xpath("/html/body/div[4]/input[2]")).click();
//     threadsleep(4000);
     
//   removing one checked box by remove button
    	driver.findElement(By.xpath("/html/body/div[3]/input[1]"));
    	 By removebutton= By.xpath("/html/body/div[3]/input[1]");
    	driver.findElement(removebutton).click();
     Assert.assertTrue("single box isnot Selected!",driver.findElement(removebutton).isDisplayed());
//     threadsleep(4000);
//     Vallidating that all list item could be removed using remove button and ToggleAll.
     driver.findElement(By.cssSelector("[name'allbox']"));
     By ToggleAll= By.cssSelector("[name'allbox'");
     driver.findElement(ToggleAll).click();
     
     driver.findElement(By.xpath("/html/body/div[3]/input[1]")).click();
     By removebuttonforall=By.xpath("/html/body/div[3]/input[1]");
    Assert.assertTrue("All Buton isnot click!",driver.findElement(removebuttonforall).isDisplayed());
//    threadsleep(4000);
     
     }
	
	}

	

     
