package com.parealcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.parealcrm.genericLib.BaseTest;

public class ReportsPage {
	@FindBy(xpath="//a[text()='Reports']") private WebElement ReportsTab;

public ReportsPage()
{
	PageFactory.initElements(BaseTest.driver,this);
	
}

public WebElement getReportsTab() {
	return ReportsTab;
}
public void clickReportsTab() {
	ReportsTab.click();
}
}