package com.parealcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.parealcrm.genericLib.BaseTest;

public class ProductsTabPage {
	@FindBy(xpath="//a[text()='Products']") private WebElement ProductsTab;
	@FindBy(xpath="//input[@value='New Product']") private WebElement NewProductTab;
	@FindBy(xpath="//input[@name='property(Product Name)']") private WebElement pntb;
	@FindBy(xpath="//input[@value='Save & New']") private WebElement snbtn;
	@FindBy(xpath="//input[@name='property(Product Name)']") private WebElement pn1tb;
	@FindBy(xpath="(//input[@value='Save'])[1]") private WebElement saveBtn;
	@FindBy(xpath="//input[@name='property(Product Name)']") private WebElement pn2tb;
	@FindBy(xpath="(//input[@value='Edit'])[1]") private WebElement etbtn;
	
public ProductsTabPage()
{
	PageFactory.initElements(BaseTest.driver, this);
}
	
	
	public WebElement getProductsTab() {
		return ProductsTab;
	}
	
	public WebElement getNewProductTab() {
		return NewProductTab;
	}


	public WebElement getPntb() {
		return pntb;
	}


	public WebElement getSnbtn() {
		return snbtn;
	}
	


	public WebElement getPn1tb() {
		return pn1tb;
	}


	

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	public WebElement getPn2tb() {
		return pn2tb;
	}


	public WebElement getEtbtn() {
		return etbtn;
	}


	public void clickProductsTab(String pn, String pn1, String pn2 )
	{
		ProductsTab.click();
		 NewProductTab.click();
		 pntb.sendKeys(pn);
		 snbtn.click();
		 pntb.sendKeys(pn1);
		 saveBtn.click();
    	 etbtn.click();
		 pntb.clear();
		 pntb.sendKeys(pn2);
		 saveBtn.click();
		 
		 
		 
		 
		 
	}


	//public void clickProductsTab(String readPropertyData, String readPropertyData2, String readPropertyData3) {
		// TODO Auto-generated method stub
		
	}


	

	
	

