package page.Classes;

import base.Classes.baseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.Objects;

public class Agile extends baseClass {
    public Agile(WebDriver driver){
        this.driver = driver;
    }
    public MemberPrashant Members(){
        elementClick("//span[@class='assignable-user ui-draggable ui-draggable-handle']//a[@class='user active'][normalize-space()='Prashant Babar']");
        return PageFactory.initElements(driver, MemberPrashant.class);
    }
}
