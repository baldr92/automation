import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.BooksSite;
import pages.MainPage;

public class ItBooksTests {
     WebDriver webDriver;
     BooksSite website;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");

        webDriver = new ChromeDriver();

        webDriver.get("http://it-ebooks.info/");
        website = new BooksSite(webDriver);

        website.mainPage().enterSearchText("Android");
        System.out.println("Step 1: Enter and search text is done");
        website.mainPage().enterSearchButton();
        System.out.println("Step 2: Enter the search button is done");
    }


    @Test
    public void testUrlSearch() {

        Assert.assertTrue(webDriver.getCurrentUrl().contains("search?q=Android"));
        System.out.println("Step Check search URL is done");
    }

    @Test
    public void testBooksSearch() throws InterruptedException {
        Assert.assertTrue(webDriver.findElement(By.id("___gcse_0")).findElements(By.tagName("tr")).size() ==14);
        webDriver.findElement(By.xpath("//*[@id=\"___gcse_0\"]//div//div//div//div[5]//div[2]//div//div//div[2]//div[9]//div[1]//div[1]//div//a")).click();
        System.out.println("Step Open and click first element is done");
    }

    @After
    public void cleanUp(){
        if (webDriver!=null){
            webDriver.quit();
        }
    }

}
