package tis.sit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOJO extends BaseClass {
	
	public LoginPOJO() {
		PageFactory.initElements(d, this);
	}
	@FindBy(id="email")
	private WebElement txtemail;
	
	public WebElement getTxtemail() {
		return txtemail;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	@FindBy(xpath="(//input[@type='password'])[1]")
	private WebElement txtpass;
	
	@FindBy(xpath ="//input[@value='Log In']")
	private WebElement btnLogin;
	
	}
