package utils;

import pages.HomePage;
import pages.LoginPage;

public class PageInitializer{

    public static LoginPage loginPage;
    public static HomePage homePage;

    public static void initializerPageObjects(){
        loginPage = new LoginPage();
        homePage = new HomePage();
    }
}
