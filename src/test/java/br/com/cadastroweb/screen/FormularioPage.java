package br.com.cadastroweb.screen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormularioPage {



    public FormularioPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "switch-version-select")
    public WebElement selectVersion;

    @FindBy(xpath = "//select[contains (.,'Bootstrap V3 Theme')]")
    public WebElement seletcBootstrapV3;

    @FindBy(id = "field-customerName")
    public WebElement fieldNome;

    @FindBy(id = "field-contactLastName")
    public WebElement fieldUltimoNome;

    @FindBy(id = "field-contactFirstName")
    public WebElement fieldPrimeiroNomeContato;


    @FindBy(id = "field-phone")
    public WebElement fieldTelefone;

    @FindBy(id = "field-addressLine1")
    public WebElement fieldEndereco1;

    @FindBy(id = "field-addressLine2")
    public WebElement fieldEndereco2;

    @FindBy(id = "field-city")
    public WebElement fieldCidade;

    @FindBy(id = "field-state")
    public WebElement fieldEstado;

    @FindBy(id = "field-postalCode")
    public WebElement fieldCep;

    @FindBy(id = "field-country")
    public WebElement fieldPais;

    @FindBy(xpath = "//a[contains( .,'Select from Employeer')]")
    public WebElement comboEmpregadora;

  //  "//a[contains(.,'Add Customer')]"
    @FindBy(xpath = "//li[contains(.,'Bott')]")
    public WebElement Bott;

    @FindBy (id = "field-creditLimit")
    public WebElement filedLimiteCredito;

    @FindBy (id = "form-button-save")
    public WebElement btnSave;

    @FindBy (id = "report-success")
    public WebElement msgSaveComSucesso;

    @FindBy(id = "save-and-go-back-button")
    public WebElement salvaRetornaLista;

    @FindBy(id = "cancel-button")
    public WebElement btnCancel;

    @FindBy(id = "report-success")
    public WebElement cadastradoComSucesso;


}





