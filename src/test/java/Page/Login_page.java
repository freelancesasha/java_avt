package Page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
    private WebDriver driver;

    public Login_page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/center/table/tbody/tr[3]/td/a")
    WebElement logout_but;

    public void check_login() throws Exception {
        Thread.sleep(2000);
        Assert.assertEquals("Logout", logout_but.getText());


    }@FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr/td[1]/table/tbody/tr[3]/td/a")
    public WebElement link_search;

    public void book_page()
    {
        link_search.click();
    }
}

