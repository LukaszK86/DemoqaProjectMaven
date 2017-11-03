package javaJava;

import Pages.Menus.SideMenu;
import Pages.RegistrationPage;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;


public class RegistrationTest extends BaseTest {

    @Test
    public void registerAccountOnDemoqa() {

        driver.get("http://demoqa.com/");

        SideMenu sideBar = PageFactory.initElements(driver, SideMenu.class);
        sideBar.clickRegistration();
        RegistrationPage registrationPage = PageFactory.initElements(driver, RegistrationPage.class);
        registrationPage.findAllMethodsFromRegistrationPage();
        registrationPage.clickSubmitnButton();
        registrationPage.typeUsername("Andrzej7272");
        registrationPage.clickSubmitnButton();
        registrationPage.typeMail("andrzej7272@.ahoj.pl");


    }
}
