package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    WebDriver driver;
    WebDriverWait webDriverWait;

    @FindBy(id = "q")
    WebElement searchInputField;

    @FindBy(xpath = "//html//body//div[1]//form//div//div[3]//div//input")
    WebElement searchButton;

    public MainPage(WebDriver webDriver) {
        driver = webDriver;
        webDriverWait = new WebDriverWait(webDriver, 30);

        PageFactory.initElements(webDriver, this);
    }

    public void enterSearchText(String text){
        searchInputField.clear();
        searchInputField.sendKeys(text);
    }

    public void enterSearchButton(){
        searchButton.click();
    }






}
