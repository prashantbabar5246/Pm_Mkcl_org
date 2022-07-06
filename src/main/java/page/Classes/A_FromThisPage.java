package page.Classes;

import base.Classes.baseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class A_FromThisPage extends baseClass {



    public void userName_m() {
       enterDetails("//input[@id='username']","prashantb");
       // WebElement  username = driver.findElement(By.xpath("//input[@id='username")).sendKeys("anket");
    }

    public void password_m() {
       enterDetails("//input[@id='password']", "Mkcl@1234");
    }

    public void radio1_m() {
        elementClick("//input[@id='autologin']");
    }

    public A_ToThisPage SimpleFormDemo() {
        elementClick("//input[@id='login-submit']");
        return PageFactory.initElements(driver, A_ToThisPage.class);
    }



}
