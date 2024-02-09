package br.com.cadastroweb.action;

import br.com.cadastroweb.screen.FormularioPage;
import org.openqa.selenium.WebDriver;

import static br.com.cadastroweb.core.BasePage.*;
import static br.com.cadastroweb.core.DriverFactory.getDriver;
import static br.com.cadastroweb.utils.Relatorio.EvidenceReport.gerarRelatorio;

public class FormularioAction extends FormularioPage {


    public FormularioAction(){ super(getDriver());}

public FormularioAction preencherInformacoesDoClienteNoFormulario(){
    escreverTexto(fieldNome,"Teste1225");
    escreverTexto(fieldUltimoNome, "Automacao");
    escreverTexto(fieldPrimeiroNomeContato, "Maurilio");
    escreverTexto(fieldTelefone, "11 98888-5444");
    escreverTexto(fieldEndereco1, "Av Brasil, 544");
    escreverTexto(fieldEndereco2, "Torre B");
    escreverTexto(fieldCidade, "Osasco");
    escreverTexto(fieldEstado, "São Paulo");
    escreverTexto(fieldCep, "06288-020");
    escreverTexto(fieldPais, "Brasil");
    clicar(comboEmpregadora);
    clicar(Bott);
    escreverTexto(filedLimiteCredito, "400");
    gerarRelatorio("Preencher Formulario", "Preencher formulario com sa informações do cliente");
    clicar(btnSave);


    return this;

        }

    public void validarMensagemDeDadosSalvosComSucesso(String mensagemEsperada) {
        esperarElementAparecerTela(cadastradoComSucesso, 10);
        gerarRelatorio("Cliente cadastrado", "Validar mensagem cliente castrado com sucesso");
        validarSeContemTexto(msgSaveComSucesso, mensagemEsperada);

    }
}








