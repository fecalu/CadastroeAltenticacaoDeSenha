import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String senha = null;
        String senhaDeConfirmacao = null;

        // Solicita a senha inicial
        System.out.println("Digite sua senha: ");
        senha = sc.nextLine();

        // Valida se a senha contém letras usando o validador
        if (!ValidadorDeSenha.validadorLetras(senha)) {
            System.out.println("Senha inválida. A senha deve conter letras.");
            return;
        }

        // Confirmação da senha
        System.out.println("Confirme sua senha: ");
        senhaDeConfirmacao = sc.nextLine();

        // Verifica se as senhas são iguais
        if (!senha.equals(senhaDeConfirmacao)) {
            if (!repetirConfirmacao(senha, sc, 3)) {
                System.out.println("Tentativas excedidas. Senha bloqueada!");
                return;
            }
        }

        System.out.println("Senha criada com sucesso!");

        // Simulação de hackeamento e alteração de senha
        System.out.println("Você foi hackeado, mude sua senha URGENTE!");

        if (!alterarSenha(senha, sc)) {
            System.out.println("Tentativas excedidas. Senha bloqueada!");
        } else {
            System.out.println("Senha alterada com sucesso!");
        }

        sc.close();
    }

    // Método para confirmar a senha com limite de tentativas
    public static boolean repetirConfirmacao(String senha, Scanner sc, int tentativasMaximas) {
        int cont = 0;
        while (cont < tentativasMaximas) {
            System.out.println("Senhas diferentes, digite novamente: " + (cont + 1) + "/" + tentativasMaximas);
            String senhaDeConfirmacao = sc.nextLine();
            if (senha.equals(senhaDeConfirmacao)) {
                return true;
            }
            cont++;
        }
        return false;
    }

    // Método para alterar a senha com validação e limite de tentativas
    public static boolean alterarSenha(String senhaAtual, Scanner sc) {
        System.out.println("Digite sua senha atual: ");
        String senha = sc.nextLine();
        int cont = 0;

        while (!senha.equals(senhaAtual) && cont < 3) {
            System.out.println("Senha incorreta. Digite novamente: " + (cont + 1) + "/3");
            senha = sc.nextLine();
            cont++;
        }

        if (!senha.equals(senhaAtual)) {
            return false;
        }

        // Nova senha com limite de 3 tentativas
        String novaSenha = null;
        cont = 0;
        boolean senhaValida = false;
        while (cont < 3 && !senhaValida) {
            System.out.println("Digite sua nova senha: ");
            novaSenha = sc.nextLine();

            // Validação da nova senha
            if (ValidadorDeSenha.validadorLetras(novaSenha)) {
                senhaValida = true;
            } else {
                System.out.println("Nova senha inválida. A senha deve conter letras. Tentativa " + (cont + 1) + "/3");
                cont++;
            }
        }

        if (!senhaValida) {
            return false;
        }

        // Confirmação da nova senha
        System.out.println("Confirme sua nova senha: ");
        String confirmacaoNovaSenha = sc.nextLine();

        if (!novaSenha.equals(confirmacaoNovaSenha)) {
            return repetirConfirmacao(novaSenha, sc, 3);
        }

        return true;
    }
}
