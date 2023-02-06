package org.utilites;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpojo extends BaseClass {
	

		
		public Loginpojo() {
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(id="email")
		private WebElement txtUser;
		
		@FindBy(id="pass")
		private WebElement txtPass;
		
		@FindBy(name="login")
		private WebElement btnLogin;
		
		@FindBy(className="navigation__hamburger__icon")
		private WebElement navigator;

		public WebElement getNavigator() {
			return navigator;
		}

		public WebElement getTxtUser() {
			return txtUser;
		}

		public WebElement getTxtPass() {
			return txtPass;
		}

		public WebElement getBtnLogin() {
			return btnLogin;
		}
		
		
	

	
}
