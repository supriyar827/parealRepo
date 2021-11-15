package com.parealcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.parealcrm.genericLib.BaseTest;

public class ShowingReportsListpage {

	//@FindBy(xpath="//input[@name='newReport']") private WebElement createnewreports;

	//public ShowingReportsListpage()
	//{
		//PageFactory.initElements(BaseTest.driver, this);
	
	//}
	@FindBy(xpath="//a[text()='Reports']") private WebElement ReportsTab;
	@FindBy(xpath="//input[@name='scheduleReport']") private WebElement ReportSchedulerTab;
	
	

	public ShowingReportsListpage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public WebElement getReportScheduler() {
		return ReportSchedulerTab;
	
	}
	public void ClickReportsTab1()
	{
		ReportsTab.click();
	}
@FindBy(xpath="//input[@name='newReportFolder']") private WebElement NewReportFolder;

public WebElement getNewReportFolder() {
	return NewReportFolder;

}
/*
 * public void ReportFolder() { ReportsTab.c	lick(); }
 */

public WebElement getReportsTab() {
	return ReportsTab;
}

public WebElement getReportSchedulerTab() {
	return ReportSchedulerTab;

}

	public void ReportSchedularTab()
	{
		ReportSchedulerTab.click();
}
}

	

	

