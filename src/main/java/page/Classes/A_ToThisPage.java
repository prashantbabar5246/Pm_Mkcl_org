package page.Classes;

import base.Classes.baseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class A_ToThisPage extends baseClass {

    public A_ToThisPage(WebDriver driver) {
        this.driver = driver;
    }

    public void projectDropdown() {
        elementClick("//span[@class='drdn-trigger']");
    }

    public EProject selectProject(String ProjectName) {
        if (ProjectName.equalsIgnoreCase("ERA")) {
            elementClick("//a[@title='ERA']");
        } else if (ProjectName.equalsIgnoreCase("All Projects")){
            elementClick("//a[normalize-space()='All Projects']");
        }
        return PageFactory.initElements(driver, EProject.class);

    }
}