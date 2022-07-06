package base.Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class baseClass {

      public WebDriver driver;

    public void invokeBrowser(String browserName) {

        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\prashantb.MKCLINDIA.000\\IdeaProjects\\Pm_Mkcl_org\\src\\test\\resources\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        } else if (browserName.equalsIgnoreCase("Mozila")) {
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\prashantb.MKCLINDIA.000\\IdeaProjects\\Pm_Mkcl_org\\src\\test\\resources\\drivers\\geckodriver.exe");
            driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        }
    }
    public void OpenURL(){
        driver.get("https://pm.mkcl.org/");
    }
    public void closeBrowser(){
        driver.close();
    }
    public void enterDetails (String xpath, String data){
        driver.findElement(By.xpath(xpath)).sendKeys(data);
    }
    public void elementClick(String xpath){
        driver.findElement(By.xpath(xpath)).click();
    }
}
