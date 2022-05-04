package com.example.wsspringbootjpa.utils.extendreports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
    public static final ExtentReports extentReports = new ExtentReports();

    public synchronized static ExtentReports createExtentReports() {
        ExtentSparkReporter reporter = new ExtentSparkReporter("/home/rateixeira/Documents/development/ws-springboot-jpa/extent-reports/a.html");
        reporter.config().setReportName("My Test Report");
        extentReports.attachReporter(reporter);
        extentReports.setSystemInfo("blabla", "pipipi");
        extentReports.setSystemInfo("Author", "Rafael Teixeira");
        return extentReports;
    }
}

