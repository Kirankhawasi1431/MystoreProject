/**
 * 
 */
package MyStore_BasePage;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.ResourceBundle;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

/** @author kpkmt942
 *Common constructor for All PageObjets and each PageObjets will extends this constructor
 *Base Constructor to achieve the PageObject Model(POM)
 *Method Reuseabality is Achieved 
 */

  public class BasePage {
	
	public static WebDriver driver;
	
	public  BasePage(WebDriver driver)
	{
		BasePage.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	 
	
  }
  

