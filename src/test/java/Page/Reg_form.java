package Page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Reg_form {

    private WebDriver driver;

    String name = "TestUser";
    public static String space = "     ";
    public static String email_var = "TeUser_12@gmail.com";
    public static String pass ="12345";




   public Reg_form(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/input")
    public WebElement fname;

    public void add_fname_contin() {
        fname.sendKeys(name);
    }

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input")
    public WebElement email;

    public void enter_email() {
        email.sendKeys(email_var);
    }

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[4]/td[2]/input")
    public WebElement first_pass;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[5]/td[2]/input")
    public WebElement confirm_pass;

    public void pass_ok() {
        first_pass.sendKeys(pass);
            }

    public void confirm_pass_ok() {
        confirm_pass.sendKeys(pass);
    }


    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[6]/td[2]/input")
    public WebElement confirm_button;

    public void confirm_button_click() {
        confirm_button.click();
    }



}
