package page.Classes;

import base.Classes.baseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class EProject extends baseClass {
    public EProject(WebDriver driver){
        this.driver = driver;
    }

    public Agile AgileClick() {
        elementClick("//a[normalize-space()='Agile']");
        return PageFactory.initElements(driver, Agile.class);
    }


    public void IssuesClick(){
        elementClick("//a[normalize-space()='Issues']");
    }

    public boolean SpentTimeClick(){
        elementClick("//a[normalize-space()='Spent time']");
        return false;

    }
    public void AddFilter(){
      WebElement add_filter =driver.findElement(By.xpath("//select[@id='add_filter_select']"));
        Select Value = new Select(add_filter);
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        Value.selectByVisibleText("Himali Shewale");
    }

    public void Name(String personName) {
        if (personName.equalsIgnoreCase("Prashant Babar")) {
            elementClick("//span[@class='assignable-user ui-draggable ui-draggable-handle']//a[@class='user active'][normalize-space()='Prashant Babar']");
        }
    }
}
