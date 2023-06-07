/**
 * 
 */
package MyStore_TestClass;



import org.testng.annotations.Test;

import MyStore_PageObjects.MyStore_IndexPage;
import MyStore_TestBase.MyStore_TestBase;
import MyStore_PageObjects.MyStore_LogInPage;


/**
 * @author kpkmt942
 *
 */
public class TC_002_LogInPage extends MyStore_TestBase{
	
	
	
	@Test
	public void LoaInPage_Test()
	
	{
		
		MyStore_IndexPage mip=new MyStore_IndexPage(MyStore_TestBase.driver);
		mip.ClickOn_SingIn();
		
		MyStore_LogInPage mlp=new MyStore_LogInPage(driver);
		
		mlp.Enter_UserName(rb.getString("UserName"), rb.getString("Password"));
		mlp.VerifyAccount();
		//mlp.NewAccount_Reg(rb.getString("NewAccount Reg"));
		
		
	}

}
