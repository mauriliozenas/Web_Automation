package br.com.cadastroweb.core;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import java.time.Duration;

import java.util.logging.Logger;

import static br.com.cadastroweb.core.DriverFactory.getDriver;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

abstract public class BasePage {

    public static Logger log = Logger.getLogger("QALogger");
    public static void esperarElementAparecerTela(WebElement element, int segundos){
        Wait <WebDriver> wait = new FluentWait<>(getDriver())
                .withTimeout(Duration.ofSeconds(segundos))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class);
        wait.until(ExpectedConditions.visibilityOfAllElements(element));
        log.info("Elemento: "+element+ " encontrado com sucesso!");
    }

    public static void escreverTexto(WebElement el, String text){
        el.sendKeys(text);
        log.info("texto: "+text+ "foi preenchido com sucesso!");
    }

    public static void clicar(WebElement el){
        el.click();
        log.info("Elemento: "+el+" clicado com sucesso!");

    }

    public static void validarSeContemTexto(WebElement texto_atual, String texto_esperado){
        assertThat(texto_atual.getText(), containsString(texto_esperado));
        log.info("Texto: "+texto_esperado+" validado com sucesso!");

    }

    public static void descerAteElementoNaTela(WebElement elemento){
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", elemento);
        esperarElementAparecerTela(elemento, 5);
        log.info("Scroll: Scroll efetuado até o elemento com sucesso!");
    }




}
