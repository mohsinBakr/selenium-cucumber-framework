package Managers;

import PageObjects.*;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {

    private final WebDriver webDriver;
    private HomePage homePage;
    private LoginPage loginPage;
    private ProductListPage productListPage;
    private ProductDetailPage productDetailPage;

    private NopCom_LandingPage nopComLandingPage;

    private NopCom_SearchResultsPage nopComSearchResultsPage;

    public PageObjectManager(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    //Short Hand If...Else
    public HomePage getHomePage() {
        return (homePage == null) ? homePage = new HomePage(webDriver) : homePage;
    }

    public NopCom_LandingPage getLandingPage() {
        return (nopComLandingPage == null) ? nopComLandingPage = new NopCom_LandingPage(webDriver) : nopComLandingPage;
    }
    public NopCom_SearchResultsPage getSearchResultsPage() {
        return (nopComSearchResultsPage == null) ? nopComSearchResultsPage = new NopCom_SearchResultsPage(webDriver) : nopComSearchResultsPage;
    }
    //General If...Else
    public LoginPage getLoginPage() {

        if (loginPage == null) {
            loginPage = new LoginPage(webDriver);
        }
        return loginPage;
    }

    public ProductListPage getProductListPage() {
        return (productListPage == null) ? productListPage = new ProductListPage(webDriver) : productListPage;
    }

    public ProductDetailPage getProductDetailPage() {
        if (productDetailPage == null) productDetailPage = new ProductDetailPage(webDriver);
        return productDetailPage;
    }
}
