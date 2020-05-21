package br.com.app;

import java.text.ParseException;

import br.com.modelo.Caixa;
import br.com.modelo.Login;
import br.com.negocio.Controle;
import br.com.negocio.Menu;

public class GerenciamentoCaixaApplication {
	public static void main(String[] args) throws ParseException{

		Menu menu = new Menu();
		Login login = new Login();
		Caixa caixa = new Caixa();
		Controle controle = new Controle();
		//int op = 1000;
		int op = -1;
		boolean autenticado = false;
		
		while(op != 0) {
			menu.imprimirMenuIniciar();
			op = controle.opcao();
		}
		
		
	}

}
