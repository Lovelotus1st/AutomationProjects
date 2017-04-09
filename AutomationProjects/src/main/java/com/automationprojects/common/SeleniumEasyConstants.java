package com.automationprojects.common;

public interface SeleniumEasyConstants {
	String DRIVER_KEY="webdriver.chrome.driver";
	String DRIVER_VALUE="D:\\InstallSoftware\\chromedriver.exe";
	
	String XPATH_INPUT_FORM=".//*[@id='navbar-brand-centered']/ul[1]/li[1]/a";
	String XPATH_SF=".//*[@id='navbar-brand-centered']/ul[1]/li[1]/ul/li[1]/a";
	String TEST_SF_TEXT="This would be your first example to start with Selenium.";
	String XPATH_SF_TEXT=".//*[@id='easycont']/div/div[2]/h3";
	String XPATH_ENTER_MESSAGE=".//input[@id='user-message']";
	String XPATH_SHOW_MESSAGE=".//*[@id='get-input']/button";
	String XPATH_DISPLAY_MESSAGE=".//*[@id='display']";
	String XPATH_ENTER_A=".//*[@id='sum1']";
	String XPATH_ENTER_B=".//*[@id='sum2']";
	String XPATH_GET_TOTAL=".//*[@id='gettotal']/button";
	String XPATH_DISPLAY_VALUE=".//*[@id='displayvalue']";
	
	String XPATH_CHECKBOX_DEMO=".//*[@id='navbar-brand-centered']/ul[1]/li[1]/ul/li[2]/a";
	String TEST_CB_TEXT="This would be a basic example to start with checkboxes using selenium.";
	String ID_SINGLE_CHECKBOX="isAgeSelected";
	String XPATH_SCB_MSG=".//*[@id='txtAge']";
	String XPATH_CB_GRP=".//*[@class='cb1-element']";
	String XPATH_BTN_CHECKALL=".//*[@id='check1']";
	String XPATH_CB_DEMO=".//*[@id='easycont']/div/div[2]/h3";
	
	String XPATH_RB_DEMO=".//*[@id='navbar-brand-centered']/ul[1]/li[1]/ul/li[3]/a";
	String RB_TITLE_CHK="This is again simple example to start working with radio buttons using Selenium.";
	String XPATH_RB_TITLE_CHK=".//*[@id='easycont']/div/div[2]/h3";
	String XPATH_RB_SINGLE_GRP=".//*[@name='optradio']";
	String XPATH_RB_BTN_CHECK=".//*[@id='buttoncheck']";
	String XPATH_RB_MSG_CHECK=".//*[@id='easycont']/div/div[2]/div[1]/div[2]/p[3]";
	String RB_VALUE="Female";
	
	
	
}
