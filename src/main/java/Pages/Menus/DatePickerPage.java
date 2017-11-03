package Pages.Menus;
import Pages.DatePicker.DatePickerData;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.junit.Assert;


public class DatePickerPage extends DatePickerData {

    @FindBy(how = How.ID, using = "datepicker1")
    WebElement fieldData;

    @FindBy(how = How.CLASS_NAME, using = "ui-datepicker-month")
    WebElement currentMonth;

    @FindBy(how = How.CSS, using = "a.ui-state-default.ui-state-active.ui-state-hover")
    WebElement currentDay;

    @FindBy(how = How.CLASS_NAME, using = "ui-datepicker-year")
    WebElement currentYear;

    public void clickFieldData() {
        fieldData.click();
    }


    private String getCurrentMonth() {
        return currentMonth.getText();
    }

    private int getCurrentDay() {
        return Integer.parseInt(currentDay.getText());
    }

    private int getCurrentYear() {
        return Integer.parseInt(currentYear.getText());
    }

    public void typeDate(DatePickerData dataToSet) {
        fieldData.sendKeys(dataToSet.getDate());
    }

    public void verifyData(DatePickerData datePickerData) {
       Assert.assertEquals(datePickerData.getMonth(), getCurrentMonth());
        Assert.assertEquals(datePickerData.getYear(), getCurrentYear());
        Assert.assertEquals(datePickerData.getDay(), getCurrentDay());
        System.out.printf("Date value: " + datePickerData.getMonth() + " " + datePickerData.getYear() + " " + datePickerData.getDay() + " is displayed! Scucess!");

    }

}




