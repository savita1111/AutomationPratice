package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;


public class SignInPageElement {
    public WebDriver driver;
    //generate random number for email

    Random random = new Random();
    public int ran = random.nextInt(900)+100;

    public SignInPageElement(WebDriver mdriver) {
        PageFactory.initElements(mdriver, this);
    }

    //******** Dashboard Page *******
    @FindBy(xpath = "//a[@class=\"login\"]")
    WebElement signinButton;

    public void clicksigninButton() {
        signinButton.click();
    }
    //********* Signin Page *******

    @FindBy(xpath = "//input[@id=\"email_create\"]")
    WebElement inputEmail;

    public void ClickinputEmail() {
        String gmail = String.valueOf(ran);
        inputEmail.sendKeys("signuptest"+gmail+"@test.com");
    }

    @FindBy(xpath = "//button[@id=\"SubmitCreate\"]")
    WebElement signupButton;

    public void createaccountButton() {
        signupButton.click();
    }

    //********** Signup Form **************
    @FindBy(xpath = "//input[@id=\"customer_firstname\"]")
    WebElement inputFirstName;

    public void ClickinputFirstName() {
        inputFirstName.sendKeys("savi");
    }

    @FindBy(xpath = "//input[@id=\"customer_lastname\"]")
    WebElement inputLastName;

    public void ClickinputLastName() {
        inputLastName.sendKeys("savi");
    }

    @FindBy(xpath = "//input[@id=\"passwd\"]")
    WebElement inputPassword;

    public void ClickinputPassword() {
        inputPassword.sendKeys("123456");
    }

    @FindBy(xpath = "//input[@id=\"address1\"]")
    WebElement inputAddress;

    public void ClickinputAddress() {
        inputAddress.sendKeys("Nepal");
    }

    @FindBy(xpath = "//input[@id=\"city\"]")
    WebElement inputCity;

    public void ClickinputCity() {
        inputCity.sendKeys("Kathmandu");
    }

    @FindBy(xpath = "//select[@id=\"id_state\"]/option[@value=\"3\"]")
    WebElement inputState;
    public void ClickinputState() {
        inputState.click();
    }


    @FindBy(xpath = "//input[@id=\"postcode\"]")
    WebElement inputPostcode;

    public void ClickinputPostcode() {
        inputPostcode.sendKeys("45444");
    }

    @FindBy(xpath = "//select[@id=\"id_country\"]")
    WebElement inputcountry;

    public void ClickinputCountry() {
        inputcountry.click();
    }

    @FindBy(xpath = "//input[@id=\"phone_mobile\"]")
    WebElement inputMobileNumber;

    public void ClickinputMobileNumber() {
        inputMobileNumber.sendKeys("01022222");
    }

    @FindBy(xpath = "//input[@id=\"alias\"]")
    WebElement inputAlias;

    public void ClickinputAlias() {
        inputAlias.sendKeys("home");
    }

    @FindBy(xpath = "//button[@id=\"submitAccount\"]")
    WebElement inputRegister;

    public void ClickRegister() {
        inputRegister.click();
    }


}
