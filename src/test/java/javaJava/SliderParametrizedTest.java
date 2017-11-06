package javaJava;

import Pages.SliderPage;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class SliderParametrizedTest extends BaseTest {

    private int expectedResult;
    private int moveValue;


    public SliderParametrizedTest(int moveValue) {
        this.moveValue = moveValue;
    }

    @Parameterized.Parameters
    public static Collection testData() {
        return Arrays.asList(new Object[][]{{5}, {0}, {4}, {8}, {8}, {10}, {11}});
    }

    @org.junit.Test
    public void moveSlidderTest() {
        driver.get("http://demoqa.com/slider/");
        SliderPage sliderPageParameterized = PageFactory.initElements(driver, SliderPage.class);
        sliderPageParameterized.moveSlider(moveValue);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String str = js.executeScript("return document.getElementById('amount1').value").toString();
        assertEquals(str, Integer.toString(moveValue));

    }

}
