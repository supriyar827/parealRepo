package com.parealcrm.products;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.parealcrm.genericLib.BaseTest;
import com.parealcrm.genericLib.FileLib;
import com.parealcrm.genericLib.WebDriverCommonLib;
import com.parealcrm.pages.Homepage;
import com.parealcrm.pages.signInpage;

public class VerifyHomePageTest extends BaseTest {
	//private static Object PROP_PATH;

	public static void main(String args[]) throws Throwable 
	{
		BaseTest bt=new BaseTest();
		bt.openBrowser();
		
		Thread.sleep(2000);
		signInpage sp = new signInpage();
	sp.Login("rashmi@dell.com", "123456");
	Thread.sleep(2000);
	//Homepage hp= new Homepage();
	//hp.ClickHomeTab();
	WebDriverCommonLib wlib=new WebDriverCommonLib();
	//Thread.sleep(2000);
	//wlib.verify(wlib.getPageTitle(), fl.readPropData(PROP_PATH, "loginTitle"), " Home Page");
     wlib.verify(FileLib.readPropData(PROP_PATH,"HomeTitle"),wlib.getPageTitle(),"Home Title");
	
	Thread.sleep(2000);
	Homepage hp= new Homepage();
		hp.ClickHomeTab();
}
}