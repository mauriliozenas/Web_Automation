package br.com.cadastroweb.screen;

import br.com.cadastroweb.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//div[@class='floatL l5'][contains(.,'Customers')]")
    public WebElement paginaInicial;

    @FindBy(xpath = "//a[contains(.,'Add Customer')]")
    public WebElement btnAddCustomer;

    @FindBy(id = "switch-version-select")
    public WebElement selectVersao;

    @FindBy(xpath = "//td[contains(., 'Teste1225')]")
    public WebElement clienteTeste1225;

    @FindBy(name = "customerName")
    public WebElement inputName;






}
