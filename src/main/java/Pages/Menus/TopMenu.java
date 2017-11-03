package Pages.Menus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TopMenu {

    WebDriver driver;

    @FindBy(how = How.LINK_TEXT, using = "Home")
    WebElement home;
    @FindBy(how = How.LINK_TEXT, using = "About us")
    WebElement aboutUs;
    @FindBy(how = How.LINK_TEXT, using = "Services")
    WebElement services;
    @FindBy(how = How.LINK_TEXT, using = "Demo")
    WebElement demo;
    @FindBy(how = How.LINK_TEXT, using = "Blog")
    WebElement blog;
    @FindBy(how = How.LINK_TEXT, using = "Contact")
    WebElement contact;
    @FindBy(how = How.LINK_TEXT, using = "Draggable")
    WebElement draggable;
    @FindBy(how = How.LINK_TEXT, using = "Tabs")
    WebElement tabs;


    public void clickHome() {
        home.click();
    }

    public void clickAboutUs() {
        aboutUs.click();
    }

    public void clickServices() {
        services.click();
    }

    public void clickDemo() {
        demo.click();
    }

    public void clickDraggable() {
        WebElement myElement = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Draggable")));
        draggable.click();
    }

    public void clickTabs() {
        tabs.click();
        WebElement myElement = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Tabs")));
    }


    public void clickBlog() {
        blog.click();
    }

    public void clickContact() {
        contact.click();

    }
}
