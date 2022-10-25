package Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    public String HOME_PAGE_URL = "https://www.epicgames.com/store/en-US/browse";
    public String Search_store_xpath = "//input[@placeholder='Search store']";

    @FindBy(xpath = "//input[@placeholder='Search store']")
    public WebElement Search_store_text;


    public HomePage() {
        PageFactory.initElements(webDriver,this);//Этот конструктор нужен для использования @FindBy
    }

    public void navigateToHomePage() {
        webDriver.get(HOME_PAGE_URL);
    }
    public boolean isSearchStoreTextVisible(){
        return elementExists(Search_store_xpath);
    }
}
