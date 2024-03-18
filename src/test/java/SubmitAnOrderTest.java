import org.example.pages.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.example.pages.ScreenshootHelper;



import java.time.Duration;

public class SubmitAnOrderTest {

    private WebDriver driver;
    public static final String NAME = "test132435@gmail.com";
    public static final String PASSWORD = "test666";
    public static final String name = "Hummingbird printed sweater";

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
    }

    @Test
    public void shouldSubmitAnOrderTest(){

        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.goToLoginPage();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.submitLogin(NAME, PASSWORD);

        headerPage.getSearchBar();
        headerPage.searchOnPage("Hummingbird printed sweater");
        headerPage.goToProductPage();

        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
        searchResultsPage.hoverAndClickQuickView();

        ProductCartPage productCartPage = new ProductCartPage(driver);
        productCartPage.selectSize("M");
        productCartPage.setQuantity(5);
        productCartPage.getAddToCartButton();
        productCartPage.goToCartPage();

        AddToCartPage addToCartPage = new AddToCartPage(driver);
        addToCartPage.getProceedToCheckoutButton();
        addToCartPage.goToShoppingCartPage();

        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        shoppingCartPage.getCheckoutButton();
        shoppingCartPage.goToOrderPage();

        OrderPage orderPage = new OrderPage(driver);
        orderPage.getContinueButton();
        orderPage.goToShippingMethod();
        orderPage.getConfirmDeliveryButton();
        orderPage.goToPayment();
        orderPage.getPaymentButton();
        orderPage.selectPayment();
        orderPage.getApproveButton();
        orderPage.approveConditions();
        orderPage.getOrderButton();
        orderPage.goToOrderConfirmation();

        ScreenshootHelper screenshootHelper = new ScreenshootHelper(driver);
        screenshootHelper.takeScreenshot(driver, "screen");

    }

    @After
    public void teardown(){

       // driver.quit();
       //driver.printscreen
    }
}
