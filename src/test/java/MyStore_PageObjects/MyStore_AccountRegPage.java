/**
 * 
 */
package MyStore_PageObjects;




import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import MyStore_ActionClass.ActionClass;

import MyStore_BasePage.BasePage;

/**
 * @author kpkmt942
 *
 */
public class MyStore_AccountRegPage extends BasePage {

	ActionClass act=new ActionClass();
	
	public MyStore_AccountRegPage() {
		super(driver);	
	
	}
	
	
	@FindBy(id="customer_firstname")
	WebElement FirstName;
	

	@FindBy(id="customer_lastname")
	WebElement LastName;
	

	@FindBy(id="customer_firstname")
	WebElement UserName;
	

	@FindBy(id="email")
	WebElement Email;
	

	@FindBy(id="passwd")
	WebElement Password;
	

	@FindBy(id="days")
	WebElement Days;
	
	@FindBy(id="months")
	WebElement Month;
	
	
	@FindBy(id="years")
	WebElement Year;
	
	@FindBy(id="newsletter")
	WebElement ChekBox1;
	
	@FindBy(id="newsletter")
	WebElement ChekBox2;
	
	@FindBy(id="submitAccount")
	WebElement RegisterAccount;
	
	public void SetFirstName(String FName, String Lanme, String email, String psw ) 
	{
		act.TextSend(FirstName, FName);
		act.TextSend(LastName, Lanme);
		act.TextSend(Email, email);
		act.TextSend(Password, psw);
	}
	
	public void SetDOB(int days, int month, int year)
	{
		act.SelectByIndex(Days, days);
		act.SelectByIndex(Month, month);
		act.SelectByIndex(Year, year);
	}
	
	public MyStore_HomePage SelectCheckBox()
	{
		act.Click(driver, ChekBox1);
		act.Click(driver, ChekBox2);
		act.Click(driver, RegisterAccount);
		return new MyStore_HomePage();
	}

}
