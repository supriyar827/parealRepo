package com.parealcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.parealcrm.genericLib.BaseTest;

public class LeadsPage {
	@FindBy(xpath="//a[text()='Leads']") private WebElement LeadsTab;
	@FindBy(xpath="//input[@value='New Lead']") private WebElement NewLeadsTab;
	
	public LeadsPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	public WebElement getLeadsTab() {
		return LeadsTab;
	}
	
public WebElement getNewLeadsTab() {
		return NewLeadsTab;
	}
public void ClickLeadPage()
{
	 LeadsTab.click();
	 NewLeadsTab.click();
	}
}
