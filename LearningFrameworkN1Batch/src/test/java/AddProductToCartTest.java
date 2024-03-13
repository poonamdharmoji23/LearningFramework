

import org.testng.annotations.Test;

import com.basepackage.BaseClass;
import com.elementRepository.HomePage;
import com.elementRepository.ProductDetailsPage;


public class AddProductToCartTest extends BaseClass{
	@Test
	public void addProductToCart() {

		HomePage home=new HomePage(driver);
		home.getVirtualGiftCardLink().click();
		
		ProductDetailsPage product=new ProductDetailsPage(driver);
		product.getRecipientNameTextField().sendKeys("L R Aditya");
		product.getRecipientEmailTextField().sendKeys("pr@gmail.com");
		product.getAddToCartButton().click();
		
		product.getShoppingCartLink().click();
		
	}
}
