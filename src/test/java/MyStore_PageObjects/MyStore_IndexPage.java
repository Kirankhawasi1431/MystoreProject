/**
 * 
 */
package MyStore_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import MyStore_ActionClass.ActionClass;
import MyStore_BasePage.BasePage;

/**
 * @author kpkmt942
 *IndexPage is the 1st page of the application 
 */

public class MyStore_IndexPage extends BasePage{

	ActionClass as=new ActionClass();
	
	public MyStore_IndexPage(WebDriver driver) {
		super(driver);
	}
		
	//WebElements or Locators for Performing The different operation
	
	@FindBy(xpath ="//a[@title='Log in to your customer account']")
	WebElement SignIn;
	
	@FindBy(xpath ="//img[@alt='My Store']")
	WebElement MyStore_Logo;
	
	@FindBy(xpath ="//input[@id='search_query_top']")
	WebElement SearchProduct;
	

	@FindBy(name="submit_search")
	WebElement SearchBtn;
	
	
	//Create a Method For Each WebElements to Perform the action on the WebElement 
	
	public MyStore_LogInPage ClickOn_SingIn()
	{ 
		as.Click(driver, SignIn);
		 return  new MyStore_LogInPage(driver);
		
	}
	
	public void ValidateLogo()
	{
		as.Isdisplayed(driver, MyStore_Logo);
	}

	public void SearchField(String PeoductName)
	{
		as.TextSend(SearchProduct, PeoductName);
		as.Click(driver, SearchBtn);
		
	}	
	
//	public void ClickOn_SearchBn()
//	{
//		as.Click(driver, SearchBtn);
//		
//	}
}
