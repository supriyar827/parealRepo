package com.parealcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ZohoCRMPage {
	@FindBy(xpath="//input[//input[@name='Submit']") private WebElement newReportSchedule;
	@FindBy(xpath="//input[@name='alertDescription']") private WebElement scheduleName;
	@FindBy(xpath="//input[@name='fromId']") private WebElement From;
	@FindBy(xpath="//select[@name='srcReport']") private WebElement SelectReport;
	@FindBy(xpath="//input[@name='status']") private WebElement Active;
	@FindBy(xpath="//input[@id='startDate']") private WebElement StartDateTime; 
	@FindBy(xpath="//input[@id='startDate']") private WebElement Time;
	@FindBy(xpath="//select[@id='repeatRate']") private WebElement repeat;
	@FindBy(xpath="//textarea[@name='otherEMails']") private WebElement RecipientDetails;
	@FindBy(xpath=" //input[@name='Submit']") private WebElement saveButton;
	@FindBy(xpath="//input[@name='cancel']") private WebElement cancelButton;
	@FindBy(xpath="nulltab") private WebElement ReportsTab;
	
	
	public WebElement getNewReportSchedule() {
		return newReportSchedule;
	}

	public WebElement getScheduleName() {
		return scheduleName;
	}

	public WebElement getFrom() {
		return From;
	}

	public WebElement getSelectReport() {
		return SelectReport;
	}

	public WebElement getActive() {
		return Active;
	}

	public WebElement getStartDateTime() {
		return StartDateTime;
	}

	public WebElement getTime() {
		return Time;
	}

	public WebElement getRepeat() {
		return repeat;
	}

	public WebElement getRecipientDetails() {
		return RecipientDetails;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}
@FindBy(xpath="//input[@name='folderName']") private WebElement FolderName;
@FindBy(xpath="//input[@name='folderDesc']") private WebElement FolderDescription;
@FindBy(xpath="//input[@name='save']") private WebElement savebtn;
@FindBy(xpath="//input[@name='cancel']") private WebElement cancelbtn;

}
