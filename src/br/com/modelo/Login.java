package br.com.modelo;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.negocio.Controle;
import br.com.negocio.Menu;

public class Login {
	
	public Scanner scanner = new Scanner(System.in);
	public Menu menu = new Menu();
	public static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	
	public void cadastrarUsuario() {
		//User
		System.out.println("Digite o nome de usuário:");
		Controle controle = new Controle();
		String u = controle.texto();
		for (Usuario usu : usuarios) {
			while(u.equals(usu.getNome())) {
				System.out.println("O usuário escolhido já existe, por favor escolha outro:");
				controle = new Controle();
				u = controle.texto();
			}
		}
		
		//Senha
		System.out.println("Digite a senha:");
		controle = new Controle();
		String s = controle.texto();
		
		//Nome
		System.out.println("Digite seu nome:");
		controle = new Controle();
		String n = controle.texto();
		//Telefone
		System.out.println("Digite seu telefone:");
		controle = new Controle();
		String num = controle.texto();
		Telefone tel = new Telefone(num);
		
		//Endereço
		System.out.printf("Insira a cidade: ");
		controle = new Controle();
		String cidade = controle.texto();
		System.out.printf("Insira a rua: ");
		controle = new Controle();
		String rua = controle.texto();
		System.out.printf("Insira o bairro: ");
		controle = new Controle();
		String bairro = controle.texto();
		System.out.printf("Insira o estado: ");
		controle = new Controle();
		String estado = controle.texto();
		System.out.printf("Insira o CEP: ");
		controle = new Controle();
		String cep = controle.texto();
		Endereco endereco = new Endereco(cidade, rua, bairro, estado, cep);
		
		//Email
		System.out.println("Digite seu email:");
		controle = new Controle();
		String email = controle.texto();
		while(!email.contains("@")) {
			System.out.println("Por favor digite um email válido:");
			controle = new Controle();
			email = controle.texto();
		}
		
		//Tipo de usuário
		System.out.println("Selecione o tipo de usuário");
		System.out.println("[1] - Pessoa Física");
		System.out.println("[2] - Pessoa Juridica");
		int t = Integer.parseInt(scanner.nextLine());
		while(t!=1 && t!=2) {
			System.out.println("Selecione uma opção válida!");
			t = Integer.parseInt(scanner.nextLine());
		}
		Usuario usuario = new Usuario(u, s, n, tel, endereco, email,t);
		
		usuarios.add(usuario);
	}
	
	
	public boolean autenticar() {
		
		//User
		System.out.println("Digite o nome de usuário:");
		String u = scanner.nextLine();
				
		//Senha
		System.out.println("Digite a senha:");
		String s = scanner.nextLine();
		
		for (Usuario usuario : usuarios) {
			if((usuario.getUser().equals(u)) && (usuario.getSenha().equals(s))) {
				usuario.setLogado(true);

				return true;
			}
		}
		System.out.println("Usuário ou senha inválidos");
		return false;
	}
	
	public Usuario userLogado() {
		for (Usuario usuario : usuarios) {
			if (usuario.getLogado() == true){
				return usuario;
			}
		}
		return null;
	}
}
