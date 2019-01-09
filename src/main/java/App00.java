//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;
//
//public class App00 {
//    public static void main(String args[]) throws InterruptedException{
//        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
//        WebDriver webDriver = new ChromeDriver();
//
//        webDriver.get("http://it-ebooks.info/");
//
//        System.out.println(webDriver.getCurrentUrl());
//        System.out.println(webDriver.getTitle());
//
//        webDriver.findElement(By.id("q")).sendKeys("Android");
//        //webDriver.findElement(By.id("q")).sendKeys(Keys.RETURN);
//        //webDriver.findElement(By.id(""));
//        webDriver.findElement(By.cssSelector("input[type='submit']")).click();
//
//        Thread.sleep(10000);
//        webDriver.quit();
//    }
//}
