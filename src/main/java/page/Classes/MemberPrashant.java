package page.Classes;

import base.Classes.baseClass;
import org.openqa.selenium.WebDriver;

public class MemberPrashant extends baseClass {
    public MemberPrashant(WebDriver driver){
        this.driver=driver;
    }
    public void WiniumTask(){
        elementClick("//dt[@class='issue-edit']//a[contains(text(),'Task #17359 (In Progress): Winium and selenium tes')]");
    }
}
