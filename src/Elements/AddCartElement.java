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
        addtoCartButton.click();
    }

    //Click continue shopping if you want to
    @FindBy(xpath = ".//i[@class=\"icon-chevron-left left\"]")
    WebElement continueShopping;

    public void clickContinueShpping(){
        continueShopping.click();
    }

      //******** Second Category ******
    @FindBy(xpath = "//a[@class=\"sf-with-ul\"][@title=\"Women\"]")
    WebElement add2ndcart;

    public void click2ndCategory(){
        add2ndcart.click();
    }
    @FindBy(xpath = "//a[@data-id-product=\"4\"][@title=\"Add to cart\"]")
    WebElement add2ndproduct;

    public void click2ndproduct(){
        add2ndproduct.click();
    }
    @FindBy(xpath = "//a[@class=\"btn btn-default button button-medium\"]")
    WebElement Checkout;

    public void clickCheckout(){
        Checkout.click();
    }
    @FindBy(xpath = "//a[@class=\"button btn btn-default standard-checkout button-medium\"]")
    WebElement proceedCheckout;

    public void clickProceed(){
        proceedCheckout.click();
    }
    @FindBy(xpath = "//a[@class=\"button-exclusive btn btn-default\"]")
    WebElement proceedCheckout2;

    public void clickProceed2(){
        proceedCheckout2.click();
    }
    @FindBy(xpath = "//p[@class=\"checkbox\"]")
    WebElement termsCondition;

    public void clickTermsCondition(){
        termsCondition.click();
    }
    @FindBy(xpath = "//button[@name=\"processCarrier\"]")
    WebElement proceedCheckout3;

    public void clickProceed3(){
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

