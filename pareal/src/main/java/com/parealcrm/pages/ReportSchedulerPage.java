package com.parealcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.parealcrm.genericLib.BaseTest;
import com.parealcrm.genericLib.WebDriverCommonLib;

public class ReportSchedulerPage {

	@FindBy(xpath="//input[@name='scheduleReport']") private WebElement ReportSchedulerTab;
	//@FindBy(xpath="//select[@name='srcReport']") private WebElement SelectReporttb;

public ReportSchedulerPage()
{
	PageFactory.initElements(BaseTest.driver, this);
	}

public WebElement getReportSchedulerTab() {
	return ReportSchedulerTab;
	
}

/*
 * public WebElement getSelectReporttb() { return SelectReporttb; }
 */
public void clickReportSchedulerTab()
{
	ReportSchedulerTab.click();

	/*
	 * WebDriverCommonLib wlib = new WebDriverCommonLib();
	 * wlib.SelectOption(SelectReporttb, 1);
	 */
}
}