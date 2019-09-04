package Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCartElement {
    public WebDriver driver;
    public AddCartElement(WebDriver mdriver) {

        PageFactory.initElements(mdriver, this);
    }
        //********* First Category*******

    @FindBy(xpath = "//a[@title=\"Women\"]")
    WebElement btnwoman;

    public void setBtnwoman() {
         btnwoman.click();
    }

    @FindBy(xpath = ".//div[@class=\"product-image-container\"]")
    WebElement product;

    public void clickProduct(){
        product.click();
    }

    @FindBy(xpath = "//button[@class=\"exclusive\"]")
    WebElement addtoCartButton;

    public void clickAddToCartButton(){
      //  driver.switchTo().frame("fancybox-frame1567579958772");
        addtoCartButton.click();
    }

    //Click continue shopping if you want to
    @FindBy(xpath = ".//i[@class=\"icon-chevron-left left\"]")
    WebElement continueShopping;

    public void clickContinueShpping(){
        continueShopping.click();
    }


      //******** Second Category ******

    @FindBy(xpath = "//span[contains(text(),'Proceed to checkout')]")
    WebElement checkoutfirst;

    public void clickCheckout1(){
        checkoutfirst.click();
    }

    @FindBy(xpath = "//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]  ")
    WebElement proceedCheckout1;

    public void clickCheckout2(){
        proceedCheckout1.click();
    }

    @FindBy(xpath = "//button[@name=\"processAddress\"]")
    WebElement proceedCheckout2;

    public void clickCheckout3(){
        proceedCheckout2.click();
    }
    @FindBy(xpath = "//input[@id=\"cgv\"]")
    WebElement termsCondition;

    public void clickTermsCondition(){
        termsCondition.click();
    }

    @FindBy(xpath = "//button[@name=\"processCarrier\"]")
    WebElement proceedCheckout3;

    public void clickCheckout4(){
        proceedCheckout3.click();
    }
    @FindBy(xpath = "//a[@class=\"cheque\"]")
    WebElement payCheck;

    public void clickPayCheck(){
        payCheck.click();
    }
    @FindBy(xpath = "//button[@class=\"button btn btn-default button-medium\"]")
    WebElement submitCart;

    public void clickSubmit(){
        submitCart.click();
    }
}

