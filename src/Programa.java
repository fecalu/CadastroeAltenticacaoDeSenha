import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String senhaDeConfirmacao = null;
		String senha = null;
		
		
		System.out.println("Digite sua senha: ");
		senha = sc.nextLine();
		
	
		
		
		
        if (ValidadorDeSenha.validadorLetras(senha)) {
            System.out.println("Senha válida."); 
        }
		
        System.out.println("Confirme sua Senha");
        senhaDeConfirmacao = sc.nextLine();
        
        if (senha.equals(senhaDeConfirmacao)) {
			System.out.println("Senha criada com sucesso!");
		}
        else {
        	int cont = 0;
        	while (!(senha.equals(senhaDeConfirmacao)) && cont < 3) {
				System.out.println("Senhas diferentes, digite novamente: " + (cont + 1) +"/3");
				senhaDeConfirmacao = sc.nextLine();
				cont++;
			}
        	if (senha.equals(senhaDeConfirmacao)) {
        		System.out.println("Senha criada com sucesso!");
			}else {
				System.out.println("Senha bloqueada!");
			}
        	
        }


		
		System.out.println("Testifica");
		
		
		
		
		
		
		
		
		sc.close();
		
		

	}

}
