package com.automationprojects.common;

public interface AmazonConstants {
	//AmazonSignInTest
	String XPATH_EMAIL=".//*[@id='ap_email']";
	String XPATH_PASSWORD=".//*[@id='ap_password']";
	String XPATH_SIGNIN=".//*[@id='signInSubmit']";
	String XPATH_SIGNIN_MOUSEOVER=".//*[@id='nav-link-accountList']/span[1]";
	String USER_EMAIL_ID="richswati22@gmail.com";
	String USER_PASSWORD="dunhill1";
	String XPATH_SIGNIN_FAIL_MSG=".//*[@id='auth-error-message-box']/div/div/ul/li/span";
	String XPATH_HELLO_MSG=".//*[@id='nav-link-accountList']/span[1]";
	String SIGN_IN_SUCCESFUL_MSG="Hello,";
	
	String DRIVER_KEY="webdriver.chrome.driver";
	String DRIVER_VALUE="D:\\chromedriver.exe";
	
	String XPATH_DEPARTMENT=".//*[@id='nav-link-shopall']/span[2]";
	String XPATH_SELECT_DEPARTMENT=".//*[@id='a-autoid-3-announce']";
	String XPATH_SELECT_SUB_DEPARTMENT=".//*[@id='eventNav_914664']/div[3]/div[2]/div[1]/div[1]/a[3]/div/div/p";
	String XPATH_PRODUCT_TITLE=".//*[@id='productTitle']";
	String XPATH_PRODUCT_BY=".//*[@id='byline']/span/span[1]/a[1]";
	String XPATH_QUANTITY=".//*[@id='quantity']";
	String XPATH_ADD_TO_CART=".//*[@id='add-to-cart-button']";
	String PRODUCT_ID="0345391802";
	
	String XPATH_VIEW_CART=".//*[@id='hlb-view-cart-announce']";
	String XPATH_DELETE_CART_BTN=".//*[@id='activeCartViewForm']/div[2]/div/div[4]/div[2]/div[1]/div/div/div[2]/div/span[1]/span/input";
	String XPATH_PROCEED_TO_CHECKOUT=".//*[@id='hlb-ptc-btn-native']";
	String XPATH_CART_PROCEED_TO_CHECKOUT=".//*[@id='sc-buy-box-ptc-button']/span/input";
	
	String XPATH_FOOTER=".//*[@id='navFooter']";
	

}
