package test.Classes;

import base.Classes.baseClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.Classes.*;

public class pmTestCases extends baseClass {
    @Test(enabled = false)
    public void loginTest() {
        A_FromThisPage lP = new A_FromThisPage();
        lP.invokeBrowser("chrome");
        lP.OpenURL();
        lP.userName_m();
        lP.password_m();
        lP.radio1_m();
        lP.closeBrowser();

    }

    @Test(priority = 2)
    public void EraProject() {
        A_FromThisPage lP = new A_FromThisPage();
        lP.invokeBrowser("chrome");
        lP.OpenURL();
        lP.userName_m();
        lP.password_m();
        lP.radio1_m();
        A_ToThisPage JTP = lP.SimpleFormDemo();
        JTP.projectDropdown();
        JTP.selectProject("Era");
        lP.closeBrowser();
    }

    @Test(priority = 1)
    public void PrashantB() {
        A_FromThisPage lP = new A_FromThisPage();
        lP.invokeBrowser("chrome");
        lP.OpenURL();
        lP.userName_m();
        lP.password_m();
        lP.radio1_m();
        A_ToThisPage JTP = lP.SimpleFormDemo();
        JTP.projectDropdown();
        EProject EP = JTP.selectProject("Era");
        EP.AgileClick();
        EP.Name("Prashant Babar");
        lP.closeBrowser();
    }

    @Test(priority = 3)// TestNG
    public void CheckIssues() {
        A_FromThisPage lP = new A_FromThisPage();
        lP.invokeBrowser("chrome");
        lP.OpenURL();
        lP.userName_m();
        lP.password_m();
        lP.radio1_m();
        A_ToThisPage JTP = lP.SimpleFormDemo();
        JTP.projectDropdown();
        EProject EP = JTP.selectProject("Era");
        EP.IssuesClick();
        // EP.SpentTimeClick();
        if (EP.SpentTimeClick()) {
            System.out.println("True");
        } else if (!EP.SpentTimeClick()) {
            System.out.println("False");
        }
        Assert.assertEquals(!EP.SpentTimeClick(), EP.SpentTimeClick(), "AssertMessage");
    }

    @Test(groups = "Smoke Testing")
    public void Click() {
        A_FromThisPage lP = new A_FromThisPage();
        lP.invokeBrowser("chrome");
        lP.OpenURL();
        lP.userName_m();
      //  lP.userName_m();
        lP.password_m();
        lP.radio1_m();
        A_ToThisPage JTP = lP.SimpleFormDemo();
        JTP.projectDropdown();
        EProject EP = JTP.selectProject("Era");
        Agile Ag = EP.AgileClick();
        MemberPrashant MPrashant= Ag.Members();
        MPrashant.WiniumTask();
    }

}
