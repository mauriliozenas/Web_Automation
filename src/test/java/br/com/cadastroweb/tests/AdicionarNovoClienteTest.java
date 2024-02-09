package br.com.cadastroweb.tests;

import br.com.cadastroweb.action.FormularioAction;
import br.com.cadastroweb.action.HomeAction;
import br.com.cadastroweb.core.Setup;
import io.qameta.allure.*;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.SeverityLevel.CRITICAL;

public class AdicionarNovoClienteTest extends Setup {

    @Test
    @Severity(CRITICAL)
    @Tags(value = {@Tag("add-cliente"),@Tag("regressivo")})
    @Epic("Disponibilizar recursos cadastrar e excluir ")
    @Story("Usuarios Cadastrados")
    @Feature("Inclusao de novos Clientes")
    @Description("Realizar a inclusão do cliente atraves do preenchimento do formulario")
    public void incluirNovoClienteNaBaseDeDados(){

        new HomeAction()
                .selecionarBootstrapV4()
                .clicaAddCliente();

        new FormularioAction()
                .preencherInformacoesDoClienteNoFormulario()
                .validarMensagemDeDadosSalvosComSucesso("Your data has been successfully stored into the database.");



    }


}
