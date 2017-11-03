package javaJava;

import Pages.DatePicker.DatePickerData;
import Pages.DatePicker.DatePickerPage;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;


public class DatePickerTest extends BaseTest {

    @Test
    public void selectData() {

        driver.get("http://demoqa.com/datepicker/");
        DatePickerPage datePickerPage = PageFactory.initElements(driver, DatePickerPage.class);
        datePickerPage.clickFieldData();
        DatePickerData datePickerData = new DatePickerData("November", 7, 2018);
        datePickerPage.typeDate(datePickerData);
        datePickerPage.verifyData(datePickerData);

    }
}
