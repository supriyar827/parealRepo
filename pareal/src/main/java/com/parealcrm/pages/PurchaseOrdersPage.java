package com.parealcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.parealcrm.genericLib.BaseTest;

public class PurchaseOrdersPage {
	@FindBy(xpath="//img[@id='scrollright']")  private WebElement sclbtn;
	@FindBy(xpath="//a[text()='Purchase Orders']") private WebElement PurchaseOrdersTab;
	//@FindBy(xpath="//img[@id='scrollright']")  private WebElement scrbtn;
	//@FindBy(xpath="//input[@value='New Purchase Order']") private WebElement NewPurchaseOrderTab;
	public PurchaseOrdersPage()
	{
		PageFactory.initElements(BaseTest.driver,this);
	}
	
public WebElement getScrbtn() {
		return sclbtn;
	}

	
//public WebElement getSclbtn() {
	//return sclbtn;
//}

public WebElement getPurchaseOrdersTab() {
	return PurchaseOrdersTab;
}

//}
//public WebElement getNewPurchaseOrderTab() {
	//return NewPurchaseOrderTab;
//}
public void choose() throws Throwable
{
	for(int i=1;i<=35;i++) {
		Thread.sleep(500);
	    sclbtn.click();
	}
	
	PurchaseOrdersTab.click();
	//NewPurchaseOrderTab.click();
	
}
}


	
	


