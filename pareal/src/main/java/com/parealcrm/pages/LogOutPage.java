package com.parealcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.parealcrm.genericLib.BaseTest;

public class LogOutPage {
	@FindBy(xpath="href=\"/crm/logout.sas\"") private WebElement logoutbtn;
	
	public LogOutPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getLogoutbtn() {
		return logoutbtn;
	}
	public void leave()
	{
		logoutbtn.click();
	}

}
