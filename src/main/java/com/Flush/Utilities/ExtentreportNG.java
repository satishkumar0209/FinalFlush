package com.Flush.Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentreportNG {
	
	static ExtentReports extent;

	public static ExtentReports getReportObject() {
		
	//	String path = System.getProperty("user.dir") + "\\reports\\NewReport.html";

		ExtentSparkReporter reporter = new ExtentSparkReporter("C:\\Users\\Satish\\eclipse-workspace\\FlushAutomation-master\\reports\\final.html");

		reporter.config().setReportName("Web Automation Results");

		reporter.config().setDocumentTitle("Automation results");

		extent = new ExtentReports();

		extent.attachReporter(reporter);

		extent.setSystemInfo("Tester", "Kumar");

		return extent;

	}

}
