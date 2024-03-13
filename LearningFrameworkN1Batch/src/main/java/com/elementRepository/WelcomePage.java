package com.elementRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.basepackage.BasePage;

public class WelcomePage extends BasePage{
//store all the webElements of welcome page
//this is the approach we use in POM
	
	public WelcomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}
	
	
	//@findBy annotation return webElement
	@FindBy(name = "q")
	private WebElement searchTextField;
	
	@FindBy(linkText = "Register")
	private WebElement registerLink;

	public WebElement getSearchTextField() {
		return searchTextField;
	}

	public WebElement getRegisterLink() {
		return registerLink;
	}
	
	@FindBy(xpath="//div[@class='listbox']/ul/li")
	private List<WebElement> categoryElements;

	public List<WebElement> getCategoryElements() {
		return categoryElements;
	}
	
	// remove bacause added into the base class
	/*
	@FindBy(linkText = "Log in")
	private WebElement loginLink;

	public WebElement getLoginLink() {
		return loginLink;
	
*/
}
