package articles;

import common.MobileAPI;
import home.MainPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ArticleTest extends MobileAPI {

    @Test
    public void openNYPandContinue(){
       MainPage mainPage = PageFactory.initElements(ad, MainPage.class);
        mainPage.clickcontiue1();
    }
    @Test
    public void HitanotherContinue(){
        MainPage mainPage = PageFactory.initElements(ad, MainPage.class);
        mainPage.clickcontiue2(); }
    @Test
    public void clickOnBuggerBttn(){
        MainPage mainPage = PageFactory.initElements(ad, MainPage.class);
        mainPage.getMenu();
    }
    @Test
    public void notificationIconeWorks(){
        MainPage mainPage = PageFactory.initElements(ad, MainPage.class);
        mainPage.notificationIcon();
    }
}
