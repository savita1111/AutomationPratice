package Test;

import Elements.SignInPageElement;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class SignupTest extends SetUp {

    @Test
    public void SignupFunction() throws InterruptedException {
        SignInPageElement SigninObj=new SignInPageElement(driver);
        SigninObj.clicksigninButton();
        sleep(4000);
        SigninObj.ClickinputEmail();
        SigninObj.createaccountButton();
        sleep(3000);
        SigninObj.ClickinputFirstName();
        SigninObj.ClickinputLastName();
        SigninObj.ClickinputPassword();
        SigninObj.ClickinputAddress();
        SigninObj.ClickinputCity();
        SigninObj.ClickinputState();
        SigninObj.ClickinputPostcode();
        SigninObj.ClickinputCountry();
        SigninObj.ClickinputMobileNumber();
        SigninObj.ClickinputAlias();
        SigninObj.ClickRegister();
    }
}
