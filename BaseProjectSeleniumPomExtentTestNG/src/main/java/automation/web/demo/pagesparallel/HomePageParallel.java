package automation.web.demo.pagesparallel;

import automation.web.demo.utils.DriverFactory;
import automation.web.demo.utils.WaitUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageParallel {
    WebDriver driver;
    WaitUtils wait;

    @FindBy(css = ".inventory_list")
    WebElement productList;

    public HomePageParallel() {
        this.driver = DriverFactory.getDriver();
        this.wait = new WaitUtils(DriverFactory.getDriver(), 10);
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }

    public boolean isVisibleListProduct(){
        return wait.waitForVisibility(productList).isDisplayed();
    }
}
