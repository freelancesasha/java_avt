package Page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Header {

    private WebDriver driver;

    public Header(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);


    }

    @FindBy(xpath = "/html/body/center/table/tbody/tr[1]/td/table/tbody/tr/td[1]/a")
    public WebElement click_logo;

    public void click_logo() {
        click_logo.click();
    }

    @FindBy(xpath = "/html/body/center/table/tbody/tr[2]/td/form/input[2]")
    public WebElement search;

    public void click_search() {
        search.click();
    }

    @FindBy(xpath = "/html/body/center/table/tbody/tr[4]/td/span")
    public WebElement assert_search_catch;

    public void asser_search_catch() throws Exception {

        Assert.assertEquals("Oops, error. No keyword is provided", assert_search_catch.getText());

    }

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr/td[1]/table/tbody/tr[2]/td/p/b")
    public WebElement author_search;
    @FindBy(xpath = "/html/body/center/table/tbody/tr[2]/td/form/input[1]")
    public WebElement enter_search;

    public void author_search() {

        enter_search.sendKeys(author_search.getText());

    }

    public void word_search() {
        enter_search.sendKeys("Aleks");
    }




    @FindBy(xpath = "/html/body/center/table/tbody/tr[4]/td/span")
    public WebElement assert_search_no;

    public void asser_search_no_found() throws Exception {

        Assert.assertEquals("Nothing is found :(",assert_search_catch.getText());

    }

    @FindBy(xpath = "/html/body/center/table/tbody/tr[1]/td/table/tbody/tr/td[3]/a")
    public WebElement shop_cart;

    public void shop_cart() throws Exception {
        Thread.sleep(2000);
        shop_cart.click();
    }








}
