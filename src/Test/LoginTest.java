package Test;

import Elements.AddCartElement;
import Elements.LoginPageElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

@Test
public class LoginTest extends SetUp {
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
        Thread.sleep(7000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('.exclusive').click();");
        //addcartobj.clickAddToCartButton();
        Thread.sleep(3000);
        //click continue shopping
        addcartobj.clickContinueShpping();
        addcartobj.clickCheckout();

       // driver.quit();
    }

    public void add2nd() {
        AddCartElement add2ndcartobj = new AddCartElement(driver);
        add2ndcartobj.click2ndCategory();
        add2ndcartobj.click2ndproduct();
        add2ndcartobj.clickProceed();
        add2ndcartobj.clickProceed2();
        add2ndcartobj.clickProceed3();
        add2ndcartobj.clickPayCheck();
        add2ndcartobj.clickSubmit();
    }
}
