package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utility.Utility;

public class ResultPage extends Utility {

    @CacheLookup
    @FindBy (xpath = "//header[@class='search-header search-card']//div//h1[1]")
    WebElement resultText;

    public ResultPage() {
        PageFactory.initElements(driver,this);
    }

    public void verifyTheResults(String expected){

        pmVerifyElements(resultText,expected,"wrong page");

    }

}
