package javaJava;

import Pages.FramesAndWindowsPage;
import Pages.Menus.TopMenu;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;


public class FramesAndWindowsTest extends BaseTest {

    @Test
    public void selectWindows() {
        driver.get("http://demoqa.com/frames-and-windows/");
        String winHandleBefore = driver.getWindowHandle();
        FramesAndWindowsPage framesAndWindowsPage = PageFactory.initElements(driver, FramesAndWindowsPage.class);
        framesAndWindowsPage.clickNewBrowserTab();
        String secondWindow = driver.getWindowHandle();

        TopMenu topMenu = PageFactory.initElements(driver, TopMenu.class);
        topMenu.clickHome();
        driver.switchTo().window(winHandleBefore);
        topMenu.clickHome();
        driver.close();
        driver.switchTo().window(secondWindow);

        Assert.assertEquals(1, driver.getWindowHandles().size());
    }
}

