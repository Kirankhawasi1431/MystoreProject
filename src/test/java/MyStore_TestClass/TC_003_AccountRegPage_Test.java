/**
 * 
 */
package MyStore_TestClass;

import MyStore_TestBase.MyStore_TestBase;

import org.testng.Assert;
import org.testng.annotations.Test;

import MyStore_ActionClass.ActionClass;
import MyStore_PageObjects.MyStore_AccountRegPage;
import MyStore_PageObjects.MyStore_HomePage;
import MyStore_PageObjects.MyStore_IndexPage;
import MyStore_PageObjects.MyStore_LogInPage;

/**
 * @author kpkmt942
 *
 */
public class TC_003_AccountRegPage_Test extends MyStore_TestBase {
	
	MyStore_LogInPage mlp;
	MyStore_HomePage mhp;
	//public MyStore_AccountRegPage mar;(Not working need to check)
	ActionClass act=new ActionClass();
	
	@Test
	public void EnterToLoginTest()
	{
		MyStore_IndexPage mip=new MyStore_IndexPage(driver);
		
		mlp=mip.ClickOn_SingIn();
		
		mlp.NewAccount_Reg(GenRandomEmail()+"@"+"gmail.com");
		
		MyStore_AccountRegPage mar=new MyStore_AccountRegPage();
		
		mar.SetFirstName(GenRandomString(), GenRandomString(), GenRandomEmail()+"@"+"gmail.com",  GenRandomNumber());
		mar.SetDOB(4, 2 , 3);
		mar.SelectCheckBox();
		
		MyStore_HomePage mhp=new MyStore_HomePage();
		
		boolean Result=mhp.VerifyNewAccountReg();
		Assert.assertTrue(Result);
	
	}
}
