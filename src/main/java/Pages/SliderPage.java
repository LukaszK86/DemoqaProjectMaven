package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SliderPage {

    private int quantity;

    @FindBy(how = How.XPATH, using = "//*[@id='slider-range-max']/span")
    WebElement slider;

    @FindBy(how = How.CSS, using = "input[id='amount1']")
    WebElement valueOfSlider;


    public void moveSlider(int quantity) {
        this.quantity = quantity;
        int liczba = Integer.parseInt(valueOfSlider.getAttribute("value"));
        if (quantity > 1 && quantity < 11) {
            if (liczba != quantity) {
                if (liczba < quantity) {
                    for (int i = 0; i < quantity - liczba; i++)
                        slider.sendKeys(Keys.ARROW_RIGHT);
                } else {
                    for (int i = 0; i <= (liczba - quantity); i++)
                        slider.sendKeys(Keys.ARROW_LEFT);
                }
            }
        } else System.out.println("Nieprawidłowa wartość: " + quantity + " .Podaj liczbę z zakresu od 1 do 10");

    }

    public int getQuantity() {
        return quantity;
    }

    public void getSliderValue() throws InterruptedException {
        System.out.println(valueOfSlider.getAttribute("value"));
    }


}

