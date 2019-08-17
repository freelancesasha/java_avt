package Page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Zip {

    private WebDriver driver;

    public Zip(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    String zip_ok = "99999";
    String zip_abc = "aaaaa";
    String zip_big = "999990";
    String zip_small = "999";


    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input")
    public WebElement zip;

    public void enter_zip() {
        zip.sendKeys(zip_ok);
    }

    public void enter_big_zip() {
        zip.sendKeys(zip_big);
    }

    public void enter_small_zip() {
        zip.sendKeys(zip_small);
    }

    public void enter_abc_zip() {
        zip.sendKeys(zip_abc);
    }






    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input")
    public WebElement contin;

    public void click_contin() {
        contin.click();

    }
    @FindBy(xpath = "/html/body/center/table/tbody/tr[4]/td/span")
    public WebElement asser_catch;


    public void asser_catch() throws Exception {

        Assert.assertEquals("Oops, error on page. ZIP code should have 5 digits",asser_catch.getText());

    }
}

