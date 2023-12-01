package exer_1;
import java.util.Scanner;
public class cadastro {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 
	 String nome;
	 String cpf;
	 String telefone;
	 String email;
	 
	 System.out.println("Digite seu nome:");
	 nome = sc.nextLine();
	 
	 System.out.println("Digite seu cpf:");
	 cpf = sc.nextLine();
	 
	 System.out.println("Digite seu telefone:");
	 telefone = sc.nextLine();
	 
	 System.out.println("Digite seu email:");
	 email = sc.nextLine();
	 
	 System.out.println("nome:\n" + nome
			            + "\ncpf:\n" + cpf 
			            + "\ntelefone:\n" + telefone
			            + "\nemail:\n" + email);
	}

}
