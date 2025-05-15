package iphone;

import iphone.iphone.Iphone;

public class Main {
	public static void main(String[] args) {
		Iphone meuIphone = new Iphone();
		meuIphone.selecionarMusica("Demons - Imagine Dragons");
        meuIphone.tocar();
        meuIphone.pausar();

        meuIphone.ligar("4002-8922");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        meuIphone.exibirPagina("https://www.apple.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
	}
}
