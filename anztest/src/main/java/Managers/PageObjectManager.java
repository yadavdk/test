package Managers;

import PageObjects.HomeLoansCalculatorsAndToolsPage;
import org.openqa.selenium.WebDriver;


public class PageObjectManager {

    private final WebDriver webDriver;
    private HomeLoansCalculatorsAndToolsPage homeLoansCalculatorsAndToolsPage;

    public PageObjectManager(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    
    public HomeLoansCalculatorsAndToolsPage getHomeLoansCalculatorsAndToolsPage() {
        if (homeLoansCalculatorsAndToolsPage == null) homeLoansCalculatorsAndToolsPage = new HomeLoansCalculatorsAndToolsPage(webDriver);
        return homeLoansCalculatorsAndToolsPage;
    }
}
