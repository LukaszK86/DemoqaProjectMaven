package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DroppablePage {

    @FindBy(how = How.XPATH, using = "//*[@id=\"draggableview\"]")
    WebElement smallSquare;

    @FindBy(how = How.XPATH, using = "//*[@id=\"droppableview\"]")
    WebElement largeSquare;

    @FindBy(how = How.XPATH, using = "//*[@id='droppableview']/p")
    WebElement wordDropped;


    public void setBuilder(WebDriver driver) {

        Actions builder = new Actions(driver);
        builder.dragAndDrop(smallSquare, largeSquare).perform();
    }

    public String getWordDropped() {
        return wordDropped.getText();
    }


}
