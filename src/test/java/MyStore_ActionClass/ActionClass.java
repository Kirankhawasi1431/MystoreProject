/**
 * 
 */
package MyStore_ActionClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import MyStore_ActionClass_InterFace.ActionClass_Interface;
import MyStore_TestBase.MyStore_TestBase;


/**
 * @author kpkmt942
 *
 */


public  class ActionClass extends MyStore_TestBase implements ActionClass_Interface
{
	

	/**
	 *Method for mouse and keybord operation 
	 * @return Boolean
	 * 
	 *
	 * Check MyStore Logo Image Presence
	 * @return - true/false
	 */
	
	//Method for mouse and keybord action 
	public void Click(WebDriver driver, WebElement ele) 
	
	{
		Actions act= new Actions(driver);
		act.click(ele).build().perform();
	}


	/**
	 * Method For to check any Logo or Any WebElement is display or not 
	 * @return Boolean
	 * 
	 *
	 * Check MyStore Logo Image Presence
	 * @return - true/false
	 */
//Method For to check any Logo or Any WebElement is display or not 
	public boolean Isdisplayed(WebDriver driver, WebElement ele)
	{
		
		boolean flag =false;
		
		ele.isDisplayed();
		flag = true;
		
		if(flag)
		{
			System.out.println("Successfully Found And Element is displayed at");
		}
		
		else
		{
			System.out.println("Successfully Found Element But Element is not displayed at");
		}
		return flag;
		}


	
	
	/**
	 * Method Name Send the text in the Search Field box
	 * @return 
	 * 
	 *
	 * @Kiran text
	 * @return - true/false
	 */
	
	public boolean TextSend(WebElement ele, String text) 
	{
		boolean flag = false;
		
		try {
			
			flag=ele.isDisplayed();
			ele.clear();
			ele.sendKeys(text);
			flag=true;
			
		}catch(Exception e)
		
		{
			System.out.println("Location Not Found");
			flag=false;
			
		}finally {
			
			if(flag)
			{
				System.out.println("Successfully entered Text in the Search Fild");
			}else {
				System.out.println("Unable to enter Text in the Search Fild");
			}

		}
		return flag;
		
		
	}


	/**
	 * MethodType Get the Text in the WebElement
	 * @return Text
	 * 
	 *
	 * @Kiran GetText
	 * @return - true/false
	 */
	public boolean GetText(WebDriver textele, WebElement ele) {
		
		boolean flag = false;
		
		try {
			
			String text=ele.getText();
			System.out.println(text);
			flag=true;
			
		}catch(Exception e)
		
		{
			System.out.println("Location Not found");
			flag=false;	
		}
		
		finally{
			
			if(flag)
			{
				System.out.println("Successfully Found a displayed Text");
			}else
				
			{
				System.out.println("Text not Found");
			}
			
		}
		
		return false;
	}


	/**
	 * Method for Select class(SelectByIndex) used for Dropdown Action 
	 * @return Text
	 * 
	 *
	 * @Kiran GetText
	 * @return - true/false
	 */
	public boolean SelectByIndex(WebElement driver, int ele) {
		
		boolean flag=false;
		
		try {
			
			Select sel=new Select(driver);
			sel.selectByIndex(ele);
			flag = true;
			
		}catch(Exception e)
		
		{
			System.out.println("Index value is not Selected at");
			flag=false;
		}finally 
		
		{
			if(flag) 
			{
				System.out.println("Successfully selected index a value");
			}else
			{
				System.out.println("Unable to get the index value");
			}
		}
		
		return false;
	}	

}
