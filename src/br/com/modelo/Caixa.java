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
	Usuario u;
	Scanner scanner = new Scanner(System.in);
	ArrayList<Entrada> entradas = new ArrayList<Entrada>();
	ArrayList<Saida> saidas = new ArrayList<Saida>();
	SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");

}
