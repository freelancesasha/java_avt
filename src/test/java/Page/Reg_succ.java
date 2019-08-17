package Page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Reg_succ {

    public static String new_email_get;
    public static String new_pass_get;
    private WebDriver driver;

    public Reg_succ(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "/html/body/center/table/tbody/tr[4]/td/span")
    public WebElement confirm_registr;

    public void check_reg() throws Exception {
        Assert.assertEquals("Account is created!", confirm_registr.getText());

    }

    @FindBy(xpath = "/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/b")
    public WebElement new_email;

    public String get_email () {

        new_email_get = new_email.getText();
                return new_email_get;
    }
    @FindBy(xpath = "/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]")
    public WebElement new_pass;

    public String get_pass ()  {

        new_pass_get = new_pass.getText();
        return new_pass_get;
    }
    @FindBy(xpath = "/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[2]/td/p/a")
    WebElement here;


    public void click_here(){
        here.click();
    }
    }
