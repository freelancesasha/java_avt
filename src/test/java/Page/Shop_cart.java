package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shop_cart {


    private WebDriver driver;
    Book_page book_page = new Book_page(driver);

    public Shop_cart(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);


    }

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td[2]")
    public WebElement title;

    public void check_book()
    {
        title.getText().equals(book_page.book_added);
    }


}

