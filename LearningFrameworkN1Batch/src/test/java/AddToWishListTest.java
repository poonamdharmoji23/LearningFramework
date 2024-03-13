
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.basepackage.BaseClass;
import com.elementRepository.HomePage;
import com.elementRepository.LoginPage;
import com.elementRepository.ProductDetailsPage;
import com.elementRepository.WelcomePage;


public class AddToWishListTest extends BaseClass{

	@Test
	public void addToWishList() throws InterruptedException {
		String loginPageLink = "https://demowebshop.tricentis.com/login";
		String userName = "komalgupta121@gmail.com";
		String password = "Shakuni123.@";
		String productLink = "https://demowebshop.tricentis.com/25-virtual-gift-card";
		String message = "The product has been added to your ";

		HomePage home = new HomePage(driver);
		boolean actualResult = home.getUserName().isDisplayed();
		softAssert.assertEquals(actualResult, true, "Login failed");
		Reporter.log("Login successful", true);

		// user clicked on add to cart button
		home.getVirtualGiftCardLink().click();
		softAssert.assertEquals(driver.getCurrentUrl(), productLink, "Product page is not displayed");
		Reporter.log("Products page is displayed", true);

		// user entered data into name text field
		ProductDetailsPage details = new ProductDetailsPage(driver);
		details.getRecipientNameTextField().sendKeys("Smith");
		String actualRecipientName = details.getRecipientEmailTextField().getAttribute("value");
		Reporter.log("User entered correct recipient name", true);

		// user entered data into email text field
		details.getRecipientEmailTextField().sendKeys("smith@gmail.com");
		String actualEmail = details.getRecipientEmailTextField().getAttribute("value");
		Reporter.log("User entered correct recipient email", true);

		// user clicked on add to wishlist
		details.getAddToWishListButton().click();
		actualResult = details.getMessage().isDisplayed();
		softAssert.assertEquals(actualResult, true, "Product was not added to wislist");
		Reporter.log("User added a product to wish list button", true);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-500);");
	}
}
