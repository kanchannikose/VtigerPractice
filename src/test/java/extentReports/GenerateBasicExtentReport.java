package extentReports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class GenerateBasicExtentReport {

	public static void main(String[] args) throws IOException {
		
		ExtentReports exRepo = new ExtentReports();
		File file=new File("report.html");
		ExtentSparkReporter exSparkRepo=new ExtentSparkReporter(file);
		exRepo.attachReporter(exSparkRepo);
		
		ExtentTest test1 = exRepo.createTest("Test 1");
		test1.pass("This is passed");
		
		ExtentTest test2 = exRepo.createTest("Test 2");
		test2.log(Status.FAIL, "This is failed");
		
		exRepo.createTest("Test 3").skip("This is skipped");
		
		exRepo.flush();
		Desktop.getDesktop().browse(new File("report.html").toURI());
		

	}

}
