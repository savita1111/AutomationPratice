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

    @FindBy(xpath = ".//button[@class=\"exclusive\"]")
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
}

