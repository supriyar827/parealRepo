package com.parealcrm.products;
//supriya
import org.testng.annotations.Test;

import com.parealcrm.genericLib.BaseTest;
import com.parealcrm.genericLib.FileLib;
import com.parealcrm.genericLib.WebDriverCommonLib;
import com.parealcrm.pages.Homepage;
import com.parealcrm.pages.NewReportSchedulePage;
import com.parealcrm.pages.ReportSchedulerPage;
import com.parealcrm.pages.ReportsPage;
import com.parealcrm.pages.ShowingReportsListpage;
import com.parealcrm.pages.signInpage;

public class ReportsTab extends BaseTest {
	// public class VerifyHomePageTest extends BaseTest {
	// private static Object PROP_PATH;

	@Test
	
	public void reportspage() throws Throwable {
		FileLib flib = new FileLib();
		signInpage sp = new signInpage();
		sp.Login(flib.readPropertyData(PROP_PATH, "un"), flib.readPropertyData(PROP_PATH, "pw"));
		Thread.sleep(2000);
		ReportsPage rp = new ReportsPage();
		rp.clickReportsTab();
		Thread.sleep(3000);
		ReportSchedulerPage rsp = new ReportSchedulerPage();
		rsp.clickReportSchedulerTab();
		Thread.sleep(6000);
		Thread.sleep(2000);
		NewReportSchedulePage np = new NewReportSchedulePage();
		np.ClickScheduleTab(flib.readPropertyData(PROP_PATH, "sn"), flib.readPropertyData(PROP_PATH, "fm"),
				flib.readPropertyData(PROP_PATH, "dt"), flib.readPropertyData(PROP_PATH, "tt"));

		Thread.sleep(1000);

	}
}