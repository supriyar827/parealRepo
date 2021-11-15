package com.parealcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.parealcrm.genericLib.BaseTest;

public class signInpage {
	@FindBy(id="userName")private WebElement untb;
	@FindBy(id="passWord")private WebElement pwtb;
	@FindBy(xpath="//input[@title='Sign In']") private WebElement signinbtn;
	
	public signInpage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	
	}

	public WebElement getUntb() {
		return untb;
	}

	public WebElement getPwtb() {
		return pwtb;
	}

	public WebElement getSigninbtn() {
		return signinbtn;
	}

public void Login(String un,String pw)
{
 untb.sendKeys(un);
 pwtb.sendKeys(pw);
 signinbtn.click();
	}
}