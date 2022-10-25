import Pages.BasePage;
import Pages.HomePage;
import Utilities.UseCaseBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.junit.jupiter.api.Assertions.*;


public class SearchTest extends UseCaseBase{
    HomePage homePage = new HomePage();
    BasePage basePage = new BasePage();

    @Test
    public void searchFeatureTest() {
        homePage.navigateToHomePage();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(homePage.Search_store_xpath)));
        assertTrue(homePage.isSearchStoreTextVisible());
        homePage.Search_store_text.sendKeys("Battlefield");
    }
}