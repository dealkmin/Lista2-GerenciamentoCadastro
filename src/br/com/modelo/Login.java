package br.com.modelo;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.negocio.Menu;

public class Login {
	
	public Scanner scanner = new Scanner(System.in);
	public Menu menu = new Menu();
	public static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	
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
}
