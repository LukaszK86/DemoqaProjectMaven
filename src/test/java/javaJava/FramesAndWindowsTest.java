package javaJava;

import Pages.FramesAndWindowsPage;
import Pages.Menus.TopMenu;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;


public class FramesAndWindowsTest extends BaseTest {

    @Test
    public void selectWindows() {
        driver.get("http://demoqa.com/frames-and-windows/");

        FramesAndWindowsPage framesAndWindowsPage = PageFactory.initElements(driver, FramesAndWindowsPage.class);
        TopMenu topMenu = PageFactory.initElements(driver, TopMenu.class);
        framesAndWindowsPage.clickNewBrowserTab();

        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        topMenu.clickHome();
        driver.close();
        driver.switchTo().window(tabs2.get(0));
        topMenu.clickHome();

        Assert.assertEquals(1, driver.getWindowHandles().size());
    }
}

