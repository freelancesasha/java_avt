package homeTest;//  Ассерты - это проверка, работает ли правильно.

// Чтобы использовать ассерт, его нужно импортировать


// перед началом нужно прописать библиотеку джиюнит, бибилиотеку для модульного тестирования
import Page.*;
import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FiveTest {


    private WebDriver driver;

    @Before
    public void setUp() throws Exception {

        driver = new ChromeDriver();
        driver.get("http://www.sharelane.com/cgi-bin/main.py");


    }

        @Test


        public void AFirstTest () throws Exception {

        MainPage mainpage = new MainPage(driver);
        Reg_form registr = new Reg_form(driver);
        Zip zip = new Zip(driver);
        Reg_succ reg_succ = new Reg_succ(driver);
        Login_page login_page = new Login_page(driver);


        mainpage.sing_uo_click();

        zip.enter_zip();

        zip.click_contin();

        registr.add_fname_contin();

        registr.enter_email();

        registr.pass_ok();

        registr.confirm_pass_ok();

        registr.confirm_button_click();

        reg_succ.check_reg();

        reg_succ.get_email();

        reg_succ.get_pass();

        reg_succ.click_here();

        mainpage.email_login_enter();

        mainpage.pass_login_enter();

        mainpage.click_login();

        login_page.check_login();

        System.out.println("New user added");


    }

        @Test

        public void Invalid_login () throws Exception {

        MainPage mainpage = new MainPage(driver);
        Login_page login_page = new Login_page(driver);
        Header searchandLogo = new Header(driver);



        // пустой
        mainpage.click_login();

        try {
            login_page.check_login();
        } catch (NoSuchElementException e) {
            System.out.println("passed");
        }
        searchandLogo.click_logo();

        //зарег эмей без пароля
        mainpage.email_login_enter();
        mainpage.click_login();
        try {
            login_page.check_login();
        } catch (NoSuchElementException e) {
            System.out.println("passed");
        }


        searchandLogo.click_logo();

        // зарег пароль без эмейл
        mainpage.pass_login_enter();
        mainpage.click_login();
        try {
            login_page.check_login();
        } catch (NoSuchElementException e) {
            System.out.println("passed");
        }
        searchandLogo.click_logo();

        // незарег эмейл c вал паролем
        mainpage.inval_email_login_enter();
        mainpage.pass_login_enter();
        mainpage.click_login();
        try {
            login_page.check_login();
        } catch (NoSuchElementException e) {
            System.out.println("passed");
        }
        searchandLogo.click_logo();

        // зарег эмей с левым паролем
        mainpage.email_login_enter();
        mainpage.inval_pass_login_enter();
        try {
            login_page.check_login();
        } catch (NoSuchElementException e) {
            System.out.println("passed");
        }
        searchandLogo.click_logo();

        // все незарегистр
        mainpage.inval_pass_login_enter();
        mainpage.inval_email_login_enter();
        mainpage.click_login();
        try {
            login_page.check_login();
        } catch (NoSuchElementException e) {
            System.out.println("passed");
        }
        searchandLogo.click_logo();
        System.out.println("It is impossible to login with invalid data");


    }

        @Test

        public void Search () throws Exception {

        Header searchandLogo = new Header(driver);


        // пустой
        searchandLogo.click_search();
        searchandLogo.asser_search_catch();
        searchandLogo.click_logo();

// по имени

        searchandLogo.author_search();
        searchandLogo.click_search();

        try {
            searchandLogo.asser_search_no_found();
        } catch (NoSuchElementException e) {
            System.out.println("Book was found");
        }

        searchandLogo.click_logo();
        searchandLogo.word_search();
        searchandLogo.click_search();

        try {
            searchandLogo.asser_search_no_found();
        } catch (NoSuchElementException e) {
            System.out.println("Book was found");
        }

        System.out.println("Search was tested. If there are no message 'Book was found' Test was not passed");

    }

        @Test

        public void Invalid_zipTest () throws Exception {

        MainPage mainpage = new MainPage(driver);
        Zip zip = new Zip(driver);
        Header searchandLogo = new Header(driver);


        mainpage.sing_uo_click();
        zip.click_contin();
        zip.asser_catch();


        searchandLogo.click_logo();
        mainpage.sing_uo_click();
        zip.enter_abc_zip();
        zip.click_contin();


        searchandLogo.click_logo();
        mainpage.sing_uo_click();
        zip.enter_big_zip();
        zip.click_contin();
        try {
            zip.asser_catch();
        } catch (Exception e) {
            System.out.println("ERROR.Too big password was accepted");
        }
        searchandLogo.click_logo();
        mainpage.sing_uo_click();
        zip.enter_small_zip();
        zip.click_contin();

        try {
            zip.asser_catch();
        } catch (Exception e) {
            System.out.println("ERROR.Too small password was accepted");
        }

    }


        @Test

        public void Buy_book () throws Exception {


        MainPage mainpage = new MainPage(driver);
        Login_page login_page = new Login_page(driver);
        Book_page book_page = new Book_page(driver);
        Header searchandLogo = new Header(driver);
        Shop_cart shop_cart = new Shop_cart(driver);


        mainpage.email_login_enter();

        mainpage.pass_login_enter();

        mainpage.click_login();

        login_page.check_login();
        login_page.book_page();
        book_page.book_added();
        book_page.add_book();

        book_page.confirm_add_book();
        searchandLogo.shop_cart();
        shop_cart.check_book();
        System.out.println("Book was added to the cart");


    }


    @After
    public void down() throws Exception {

        driver.quit();


    }
}

