package org.repository;

import org.commonmethods.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RepositoryPage extends CommonMethods {
public RepositoryPage(){
	PageFactory.initElements(driver, this);
}
@FindBy(id = "email")
private WebElement user;
@FindBy(id = "pass")
private WebElement password;
@FindBy(name = "login")
private WebElement login;
public WebElement getUser() {
	return user;
}
public WebElement getPassword() {
	return password;
}
public WebElement getLogin() {
	return login;
}

}
