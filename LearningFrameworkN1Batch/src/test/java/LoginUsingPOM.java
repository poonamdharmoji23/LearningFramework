

import org.testng.annotations.Test;

import com.basepackage.BaseClass;
import com.elementRepository.LoginPage;
import com.elementRepository.WelcomePage;


public class LoginUsingPOM extends BaseClass{
	@Test
	public void login() {

		WelcomePage welcome=new WelcomePage(driver);
		welcome.getLoginLink().click();
		
		LoginPage login=new LoginPage(driver);
		login.getEmailTextField().sendKeys("komalgupta121@gmail.com");
		login.getPasswordTextField().sendKeys("Shakuni123.@");
		login.getLoginButton().click();
	}
}
