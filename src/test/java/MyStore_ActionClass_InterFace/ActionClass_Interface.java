/**
 * 
 */
package MyStore_ActionClass_InterFace;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author kpkmt942 added on 18-05-2023
 *
 */
	public interface ActionClass_Interface {
	
	public void Click(WebDriver driver, WebElement ele);
	public boolean Isdisplayed(WebDriver driver, WebElement ele);
	public boolean TextSend(WebElement ele, String  text);
	public boolean GetText(WebDriver textele, WebElement ele);
	public boolean SelectByIndex(WebElement driver, int ele);

}
