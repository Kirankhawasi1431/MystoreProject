/**
 * 
 */
package MyStore_PageObjects;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import MyStore_ActionClass.ActionClass;
import MyStore_BasePage.BasePage;

/**
 * @author kpkmt942
 *
 */
public class MyStore_HomePage extends BasePage{
	
	ActionClass act=new ActionClass();
	
	public MyStore_HomePage() {
		super(driver);
		
	}	
	
	@FindBy(xpath = "//p[@class=\"info-account\"]")
	WebElement LoginMyAccount;
	
	@FindBy(xpath = "//p[@class=\"alert alert-success\"]")
	WebElement RegMyAccount;
	
	@FindBy(xpath = "//ul[@class=\"myaccount-link-list\"]//li")
	List<WebElement> MyAccountLinkList;
	
	
	//Verify the Account when Exesting user LogIn
	public void VerifyAccount() 
	{
		System.out.println(act.Isdisplayed(driver, LoginMyAccount));
		
	}
	
	//verify the Account when new user is login
	public boolean VerifyNewAccountReg() 
	{
		return act.Isdisplayed(driver, RegMyAccount);
	}
	
	public void VerifyMyAccountLinkList()
	{
		for(WebElement list:MyAccountLinkList)
		{
			System.out.println("Personal Information are displayed in the HomePage are:"+list.getText());
		}
		
	}

}
