package br.com.cadastroweb.action;

import br.com.cadastroweb.screen.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import static br.com.cadastroweb.core.DriverFactory.getDriver;
import static br.com.cadastroweb.utils.Relatorio.EvidenceReport.gerarRelatorio;

import org.openqa.selenium.support.ui.Select;

import static br.com.cadastroweb.core.BasePage.*;
import static br.com.cadastroweb.core.DriverFactory.getDriver;
import static br.com.cadastroweb.utils.Relatorio.EvidenceReport.gerarRelatorio;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class HomeAction extends HomePage {


    public HomeAction() {
        super(getDriver());
    }



    public void clicaAddCliente() {
        btnAddCustomer.click();
        gerarRelatorio("Add Cliente","Clicar no botão 'Add Customer'");

    }

    public HomeAction selecionarBootstrapV4() {
        Select dropdown = new Select(selectVersao);
        dropdown.selectByVisibleText("Bootstrap V4 Theme");
        gerarRelatorio("Selecionar Menu","Selecionar novo menu bootstrapv4");
        return this;
    }

    public HomeAction selecionarClienteParaExcluir(String cliente) {
        esperarElementAparecerTela(paginaInicial,10);
        gerarRelatorio("Selecionar Cliente","Selecionar cliente a ser excluido");
        return this;

    }

    public HomeAction habilitarCheckBoxDelete() {
        gerarRelatorio("Habilitar checkbox","Selecionar checkbox do cliente  a ser excluido");

        return this;

    }

    public HomeAction deletarCadastroCliente() {
        gerarRelatorio("Deletar Cliente","Clicar em deletar cliente");

        return this;

    }

    public HomeAction validarAlertaParaConfirmarExclusao(String msg_alerta_esperado) {

        gerarRelatorio("Alerta Confirmar exclusão","Validar mensagem sobre a confirmação da exclusão");
        return this;

    }

    public HomeAction confirmarExclusao() {
        return this;

    }

    public void validarMensagemExcluidoComSucesso(String mensagemExcluidoComSucesso) {
        gerarRelatorio("Deletado com sucesso","Validar mensagem deletado com sucesso");
    }
}
