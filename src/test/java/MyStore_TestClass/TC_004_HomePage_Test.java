/**
 * 
 */
package MyStore_TestClass;

import org.testng.annotations.Test;


import MyStore_PageObjects.MyStore_HomePage;

import MyStore_TestBase.MyStore_TestBase;


/**
 * @author kpkmt942
 *
 */
public class TC_004_HomePage_Test extends MyStore_TestBase {
	
	
	@Test
	public void HomePage_Test()
	{
		TC_002_LogInPage lip=new TC_002_LogInPage();
		lip.LoaInPage_Test();
		

		MyStore_HomePage mhp=new MyStore_HomePage();
		
		mhp.VerifyMyAccountLinkList();
		
		
	} 

}
