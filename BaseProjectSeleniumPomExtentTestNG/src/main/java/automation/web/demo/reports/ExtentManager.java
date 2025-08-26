package automation.web.demo.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import static automation.web.demo.utils.GlobalConf.PATH;

public class ExtentManager {
    private static ExtentReports extent;

    public static ExtentReports getInstance() {
        if (extent == null) {
            ExtentSparkReporter reporter = new ExtentSparkReporter(PATH + "ExtentReport.html");
            reporter.config().setReportName("Reporte de Pruebas Automatizadas");
            reporter.config().setDocumentTitle("Resultados - TestNG + Selenium");

            extent = new ExtentReports();
            extent.attachReporter(reporter);
            extent.setSystemInfo("Tester", "Adrián Pulido");
            extent.setSystemInfo("Framework", "Selenium + TestNG + POM");
        }
        return extent;
    }
}
