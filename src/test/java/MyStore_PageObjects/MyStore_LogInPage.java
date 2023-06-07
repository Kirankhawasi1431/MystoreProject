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
 *
 */
public class MyStore_LogInPage extends BasePage {
	
	ActionClass act=new ActionClass();

	public MyStore_LogInPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath = "//input[@id='email']")
	WebElement UserName;
	
	@FindBy(xpath = "//input[@id='passwd']")
	WebElement Password;
	
	@FindBy(xpath = "//span[normalize-space()='Sign in']")
	WebElement SignIn;
	
	@FindBy(xpath = "//input[@id='email_create']")
	WebElement EmailforNew;
	
	@FindBy(xpath = "//span[normalize-space()='Create an account']")
	WebElement CreatNew_Account;
	
	@FindBy(xpath = "//p[@class=\"info-account\"]")
	WebElement MyAccount;
	
	
	public MyStore_HomePage Enter_UserName(String UName,String psw)
	{
		act.TextSend(UserName, UName);
		act.TextSend(Password, psw);
		act.Click(driver, SignIn);
		return new MyStore_HomePage();
	}
	
	public void VerifyAccount() 
	{
		
		System.out.println(act.Isdisplayed(driver, MyAccount));
		act.GetText(driver, MyAccount);
		
	}
	
	public MyStore_AccountRegPage NewAccount_Reg(String NewEmail)
	{
		act.TextSend(EmailforNew, NewEmail);
		act.Click(driver, CreatNew_Account);
		return new MyStore_AccountRegPage();
	}


}
