package Test;

import Elements.AddCartElement;
import Elements.LoginPageElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class LoginTest extends SetUp {

    @Test
    public void Loginfunction() throws InterruptedException {
        LoginPageElement loginobj = new LoginPageElement(driver);
        loginobj.clickSigninButton();
        loginobj.clickEmailAddress();
        loginobj.clickPassword();
        loginobj.clickSignin();
        addCart();
    }
    public void addCart() throws InterruptedException {
        AddCartElement addcartobj = new AddCartElement(driver);
        addcartobj.setBtnwoman();
        addcartobj.clickProduct();
        Thread.sleep(4000);
        driver.switchTo().frame(0);
        addcartobj.clickAddToCartButton();
        Thread.sleep(3000);
        addcartobj.clickContinueShpping();
        add2nd();

    }

    public void add2nd() throws InterruptedException {
        AddCartElement add2ndcartobj = new AddCartElement(driver);
        Thread.sleep(3000);
        driver.get("http://automationpractice.com/index.php?id_category=8&controller=category");
        add2ndcartobj.click2ndproduct();
        Thread.sleep(2000);
        driver.switchTo().frame(0);
        add2ndcartobj.clickAddToCartButton();
        add2ndcartobj.clickCheckout1();

    }
}
