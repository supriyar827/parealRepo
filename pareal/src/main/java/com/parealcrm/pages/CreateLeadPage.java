package com.parealcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.parealcrm.genericLib.BaseTest;

public class CreateLeadPage {
	@FindBy(xpath="//input[@name='property(Company)']") private WebElement cntb;
	@FindBy(xpath="//input[@name='property(Last Name)']") private WebElement lntb;
	@FindBy(xpath="(//input[@value='Save'])[1]") private WebElement svbtn;
	@FindBy(xpath="//input[@value='New Task']") private WebElement newtaskbtn;
	
	public CreateLeadPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	public WebElement getCntb() {
		return cntb;
	}
	
	public WebElement getLntb() {
		return lntb;
	}
	
	public WebElement getSvbtn() {
		return svbtn;
	}
	public WebElement getNewtaskbtn() {
		return newtaskbtn;
	}
	public void Data(String cn,String lnl)
	{
		cntb.sendKeys(cn);
		lntb.sendKeys(lnl);
		svbtn.click();
		newtaskbtn.click();
		
		
	}

}
