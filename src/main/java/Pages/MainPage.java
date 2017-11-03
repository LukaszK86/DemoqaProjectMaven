package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage {

    @FindBy(how = How.ID, using = "ui-id-1")
    WebElement Tab1;
    @FindBy(how = How.ID, using = "ui-id-2")
    WebElement Tab2;
    @FindBy(how = How.ID, using = "ui-id-3")
    WebElement Tab3;
    @FindBy(how = How.ID, using = "ui-id-4")
    WebElement Tab4;
    @FindBy(how = How.ID, using = "ui-id-5")
    WebElement Tab5;

    public void clickTab1() {
        Tab1.click();
    }

    public void clickTab2() {
        Tab2.click();
    }

    public void clickTab3() {
        Tab3.click();
    }

    public void clickTab4() {
        Tab4.click();
    }

    public void clickTab5() {
        Tab5.click();
    }

}
