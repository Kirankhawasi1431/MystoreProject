/**
 * 
 */
package MyStore_TestClass;

import MyStore_TestBase.MyStore_TestBase;
import MyStore_PageObjects.MyStore_IndexPage;
/**
 * @author kpkmt942
 *
 */
public class TC_001_IndexPageTest extends MyStore_TestBase {
	
	@org.testng.annotations.Test
	public void Test()
	{
		
		MyStore_IndexPage mi=new MyStore_IndexPage(MyStore_TestBase.driver);
		mi.ClickOn_SingIn();
		//mi.ValidateLogo();
		mi.SearchField(rb.getString("Product"));
		//mi.ClickOn_SearchBn();
		
	}

	

}
