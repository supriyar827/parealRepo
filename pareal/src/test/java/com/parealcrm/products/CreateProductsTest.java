package com.parealcrm.products;

import org.testng.annotations.Test;

import com.parealcrm.genericLib.BaseTest;
import com.parealcrm.genericLib.FileLib;
import com.parealcrm.pages.ProductsTabPage;
import com.parealcrm.pages.signInpage;

public class CreateProductsTest  extends BaseTest  {

	
	@Test
	public void productsTest() throws Throwable {
		signInpage sp = new signInpage();
		FileLib flib = new FileLib();
	
		sp.Login(flib.readPropertyData(PROP_PATH,"un"),
				flib.readPropertyData(PROP_PATH,"pw"));
		Thread.sleep(2000);
		
		ProductsTabPage ps = new ProductsTabPage();
		ps.getProductsTab();
		ProductsTabPage pp = new ProductsTabPage();
		pp.getNewProductTab();
		Thread.sleep(4000);
		//1ProductsTabPage pn = new ProductsTabPage();
		pp.clickProductsTab(flib.readPropertyData(PROP_PATH,"pn"),
				flib.readPropertyData(PROP_PATH,"pn1"),
				flib.readPropertyData(PROP_PATH,"pn2"));
			Thread.sleep(3000);
			
	}
	}
		
		
	



