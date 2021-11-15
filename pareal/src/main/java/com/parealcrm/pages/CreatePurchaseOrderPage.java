package com.parealcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.parealcrm.genericLib.BaseTest;

public class CreatePurchaseOrderPage {
	@FindBy(xpath="//input[@name='property(Subject)']") private WebElement Subtb;
	@FindBy(xpath="//img[@title='Vendor Name Lookup']") private WebElement Vntb;
	
	public CreatePurchaseOrderPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
		
	}

	public WebElement getSubjecttb() {
		return Subtb;
	}
	
	public WebElement getSubtb() {
		return Subtb;
	}

	public WebElement getVntb() {
		return Vntb;
	}

	public void OrderDetails(String sb)
	{
		Subtb.sendKeys(sb);
		Vntb.click();
		
	}
}
