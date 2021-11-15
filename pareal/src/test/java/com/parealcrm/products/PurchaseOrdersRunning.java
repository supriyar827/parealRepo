package com.parealcrm.products;

import org.testng.annotations.Test;

import com.parealcrm.genericLib.BaseTest;
import com.parealcrm.genericLib.FileLib;
import com.parealcrm.pages.CreatePurchaseOrderPage;
import com.parealcrm.pages.NewPurchaseOrderPage;
import com.parealcrm.pages.PurchaseOrdersPage;
import com.parealcrm.pages.signInpage;

public class PurchaseOrdersRunning extends BaseTest {
	@Test
	public void purchase() throws Throwable {
		signInpage sp = new signInpage();
		FileLib flib = new FileLib();
	
		sp.Login(flib.readPropertyData(PROP_PATH,"un"),
				flib.readPropertyData(PROP_PATH,"pw"));
		Thread.sleep(2000);
		PurchaseOrdersPage po = new PurchaseOrdersPage();
		po.choose();
		po.getPurchaseOrdersTab();
		Thread.sleep(2000);
		NewPurchaseOrderPage npo = new NewPurchaseOrderPage();
		npo.order();
		Thread.sleep(2000);
		CreatePurchaseOrderPage cpo = new CreatePurchaseOrderPage();
		cpo.OrderDetails(flib.readPropertyData(PROP_PATH, "sb"));
		Thread.sleep(2000);
}
}