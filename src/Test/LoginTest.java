package Test;

import Elements.AddCartElement;
import Elements.LoginPageElement;
import org.testng.annotations.Test;

@Test
public class LoginTest extends SetUp {
    public void Loginfunction() {
        LoginPageElement loginobj = new LoginPageElement(driver);
        loginobj.clickSigninButton();
        loginobj.clickEmailAddress();
        loginobj.clickPassword();
        loginobj.clickSignin();
        addCart();
    }
    public void addCart(){
        AddCartElement addcartobj = new AddCartElement(driver);
        addcartobj.setBtnwoman();
       // driver.quit();
    }
}
