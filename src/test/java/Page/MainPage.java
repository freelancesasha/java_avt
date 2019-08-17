package Page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MainPage {

    private WebDriver driver;

    public MainPage (WebDriver driver){
        this.driver=driver;

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/center/table/tbody/tr[1]/td/table/tbody/tr/td[3]/a")
    public WebElement shop_cart;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[4]/a")
    public WebElement sing_up;

    // создаем методы для элементов, например, этот метод будет кликать на шопинг карт

    public void clickshop_сart(){

        shop_cart.click();

    }

        public void sing_uo_click(){

        sing_up.click();
    }
    @FindBy(xpath = "/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[1]/p/input")
    public WebElement email_login;
    public void email_login_enter(){
        email_login.sendKeys(Reg_succ.new_email_get);
    }

    public void inval_email_login_enter(){
        email_login.sendKeys(Reg_form.email_var);
    }

    @FindBy(xpath = "/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[2]/p/input")
    public WebElement pass_login;
    public void pass_login_enter(){
        pass_login.sendKeys(Reg_succ.new_pass_get);
    }
    public void inval_pass_login_enter(){
        pass_login.sendKeys(Reg_form.pass);
    }
    @FindBy(xpath = "/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[3]/input")
    public WebElement click_login;
    public void click_login() {
        click_login.click();
    }



          }



