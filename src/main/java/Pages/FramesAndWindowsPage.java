package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FramesAndWindowsPage {

    @FindBy(how = How.LINK_TEXT, using = "New Browser Tab")
    WebElement newBrowserTab;


    public void clickNewBrowserTab() {
        newBrowserTab.click();
    }
}
