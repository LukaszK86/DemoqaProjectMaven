package javaJava;

import Pages.SliderPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class SliderParameterizedTest extends BaseTest {

    @DataProvider(name = "test1")
    public static Object[][] createData() {
        return new Object[][]{
                new Object[]{new Integer(4)},
                new Object[]{new Integer(6)},
                new Object[]{new Integer(6)},
                new Object[]{new Integer(2)},
                new Object[]{new Integer(4)},
                new Object[]{new Integer(1)}
        };
    }

    @Test(dataProvider = "test1")
    public void testMoveSlider(int moveQuantity) throws InterruptedException {
        driver.get("http://demoqa.com/slider/");

        SliderPage sliderPageParameterized = PageFactory.initElements(driver, SliderPage.class);
        sliderPageParameterized.moveSlider(moveQuantity);


    }






}