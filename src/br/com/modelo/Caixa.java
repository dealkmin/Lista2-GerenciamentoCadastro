package br.com.modelo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Caixa {
	
	private String[] grupoEPFisica = {"Salario", "Investimento"};
	private String[] grupoEPJuridica = {"Receitas de vendas", "Investimento"};
	private String[] grupoSPFisica = {"Energia", "Gás","Alimentação em casa", "Alimentação fora de casa", "Locomoção", "Outros"};
	private String[] grupoSPJuridica = {"Energia", "Gás","Alimentação interna", "Locomoção", "Outros"};
	Login login = new Login();
	Usuario user;
	Scanner scanner = new Scanner(System.in);
	ArrayList<Entrada> entradas = new ArrayList<Entrada>();
	ArrayList<Saida> saidas = new ArrayList<Saida>();
	SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
	
	public void cadastrarEntrada() {
		user =login.userLogado();
		//Tipo
		System.out.println("Selecione o tipo de entrada:");
		int i = 0;
		if(user.getTipo() == 1) {
			while(i<=1) {
				System.out.println("[ "+ i +" ]"+grupoEPFisica[i]);
				i++;
			}
		}else {
			while(i<=1) {
				System.out.println("[ "+ i +" ]"+grupoEPJuridica[i]);
				i++;
			}
		}
		int t = Integer.parseInt(scanner.nextLine());
		
		//Valor
		System.out.println("Digite o valor:");
		double v = Double.parseDouble(scanner.nextLine());
		
		//Data
		System.out.println("Digite a data: (dd/mm/aaaa)");
		String d = scanner.nextLine();
		
		Entrada entrada = new Entrada(user, v, d, t);
		
		entradas.add(entrada);
		System.out.println("Nova entrada cadastrada!");
		
	}
	
	public void cadastrarSaida() {
		user = login.userLogado();
		
		//Tipo
		System.out.println("Selecione o tipo de saída:");
		int i = 0;
		if(user.getTipo() == 1) {
			while(i<6) {
				System.out.println("[ "+ i +" ]"+grupoSPFisica[i]);
				i++;
			}
		}else {
			while(i<5) {
				System.out.println("[ "+ i +" ]"+grupoSPJuridica[i]);
				i++;
			}
		}
		int t = Integer.parseInt(scanner.nextLine());
		
		//Valor
		System.out.println("Digite o valor:");
		double v = Double.parseDouble(scanner.nextLine());
		
		//Data
		System.out.println("Digite a data (dd/mm/aaaa):");
		String d = scanner.nextLine();
		
		Saida saida = new Saida(user, v, d, t);
		
		saidas.add(saida);
		System.out.println("Nova saída cadastrada!");
		
	}
	
	public void imprimirEntrada() {
		for (Entrada entrada : entradas) {
			System.out.println("Usuario: " + entrada.getUsuario().getNome());
			System.out.println("Valor: " + entrada.getValor());
			System.out.println("Data: " + entrada.getData());
			System.out.println("Tipo: " + entrada.getGrupo());
		}
	}
	

}
