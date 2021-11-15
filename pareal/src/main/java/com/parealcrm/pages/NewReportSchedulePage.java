package com.parealcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.parealcrm.genericLib.BaseTest;
import com.parealcrm.genericLib.WebDriverCommonLib;

public class NewReportSchedulePage {
	@FindBy(xpath = "//input[@value='New Report Schedule']")
	private WebElement NewReportScheduletab;
	@FindBy(xpath = "//input[@name='alertDescription']")
	private WebElement nametb;
	@FindBy(xpath = "//input[@name='fromId']")
	private WebElement Fromtb;
	@FindBy(xpath = "//select[@name='srcReport']")
	private WebElement SelectReporttb;
	@FindBy(xpath = "//select [@id='repeatRate']")
	private WebElement Repeattb;
	
	@FindBy(xpath = "//input[@id='startDate']")
	private WebElement Datetb;
	@FindBy(xpath = "//input[@name='startTime']")
	private WebElement Timetb;
	@FindBy(xpath = "(//input[@value='Save'])[1]")
	private WebElement savetb;
	@FindBy(xpath = ("//a[text()='suppi']")) 
	private WebElement list;
	

	public NewReportSchedulePage() {
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getNewReportSchedulePage() {
		return NewReportScheduletab;
	}

	public WebElement getNametb() {
		return nametb;
	}

	public WebElement getFromtb() {
		return Fromtb;
	}

	public WebElement getNewReportScheduletab() {
		return NewReportScheduletab;
	}

	public WebElement getSelectReporttb() {
		return SelectReporttb;
	}

	public WebElement getRepeattb() {
		return Repeattb;
	}

	public WebElement getDatetb() {
		return Datetb;
	}

	

	public WebElement getTimetb() {
		return Timetb;
	}

	public void ClickScheduleTab(String sn, String fm , String dt , String tt) {
		NewReportScheduletab.click();
		nametb.sendKeys(sn);
		Fromtb.sendKeys(fm);
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		wlib.SelectOption(SelectReporttb, 1);
		wlib.SelectOption(Repeattb, 3);
		Datetb.sendKeys(dt);
		Timetb.sendKeys(tt);
		savetb.click();
	
		/*
		 * { if(List.con a[contains(text(),'suppi')]) }
		 */

	}

}
