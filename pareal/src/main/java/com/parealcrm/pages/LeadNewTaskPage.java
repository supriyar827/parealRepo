package com.parealcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.parealcrm.genericLib.BaseTest;

public class LeadNewTaskPage {
	@FindBy(xpath="//input[@name='property(subject)']") private WebElement subbtn;
	@FindBy(xpath="(//input[@value='Save'])[1]") private WebElement svbtn;
public LeadNewTaskPage()
{
	PageFactory.initElements(BaseTest.driver, this);
}
public WebElement getNewTaskbtn() {
	return subbtn;
}

public WebElement getSubbtn() {
	return subbtn;
}
public WebElement getSvbtn() {
	return svbtn;
}
public void NewTasks(String sub)
{
	subbtn.sendKeys(sub);
	svbtn.click();
	}
}
