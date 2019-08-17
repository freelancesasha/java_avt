package Page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_page {

    private WebDriver driver;

    public Book_page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr/td[2]/p[2]/a")
    WebElement add_book;

    public void add_book() {
        add_book.click();
    }

    @FindBy(xpath = "/html/body/center/table/tbody/tr[4]/td/span")
    WebElement confirm_add_book;

    public void confirm_add_book() throws Exception {
        Assert.assertEquals("Book was added to the Shopping Cart", confirm_add_book.getText());
    }

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr/td[2]/p[2]")
    WebElement title_check;
    public static String book_added;

    public String book_added() {
        book_added = title_check.getText();
        return book_added;

    }


}

