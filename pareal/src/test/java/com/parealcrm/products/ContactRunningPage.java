package com.parealcrm.products;

import org.testng.annotations.Test;

import com.parealcrm.genericLib.BaseTest;
import com.parealcrm.genericLib.FileLib;
import com.parealcrm.genericLib.WebDriverCommonLib;
import com.parealcrm.pages.CloneContactPage;
import com.parealcrm.pages.ContactsPage;
import com.parealcrm.pages.CreateContatPage;
import com.parealcrm.pages.LogOutPage;
import com.parealcrm.pages.signInpage;

public class ContactRunningPage extends BaseTest {
	@Test
	public void ContactPage() throws Throwable {
		signInpage sp = new signInpage();
		FileLib flib = new FileLib();
                     //WebDriverCommonLib wd = new WebDriverCommonLib();	
		sp.Login(flib.readPropertyData(PROP_PATH,"un"),
				flib.readPropertyData(PROP_PATH,"pw"));
		
         ContactsPage cp=new ContactsPage();
         cp.ClickContactsTab();
         CreateContatPage ccp = new CreateContatPage();
         Thread.sleep(2000);
         ccp.ContactDetails(flib.readPropertyData(PROP_PATH, "ln"),
        		            flib.readPropertyData(PROP_PATH, "lan"));
        		           
         Thread.sleep(1000);
         
         CloneContactPage cc = new CloneContactPage();
         Thread.sleep(2000);
        
     
         
         
	}
	}