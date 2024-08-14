package extentReports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class RelatedLog {

	public static void main(String[] args) throws IOException {
		
		ExtentReports exRepo =new ExtentReports();
		File file=new File("report.html");
		ExtentSparkReporter exSparkRepo= new ExtentSparkReporter(file);
		exRepo.attachReporter(exSparkRepo);
		
		exRepo
		.createTest("Test 1")
		.log(Status.PASS, "pass")
		.log(Status.FAIL, "fail")
		.log(Status.WARNING, "warning")
		.log(Status.SKIP, "skip")
		.log(Status.INFO, "info")
		.log(Status.PASS, "pass")
		.log(Status.FAIL, "fail")
		.log(Status.WARNING, "warning");
		
		
		
		
		exRepo.flush();
		Desktop.getDesktop().browse(new File("report.html").toURI());

	}

}
