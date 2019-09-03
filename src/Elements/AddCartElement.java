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
}
