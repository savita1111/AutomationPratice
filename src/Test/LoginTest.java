package Test;

import Elements.AddCartElement;
import Elements.LoginPageElement;
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
        WebDriverWait wait = new WebDriverWait(driver,10);
        //Thread.sleep(7000);
        addcartobj.clickAddToCartButton();
        Thread.sleep(3000);
        //click continue shopping
        addcartobj.clickContinueShpping();

       // driver.quit();
    }
}
