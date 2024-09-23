
public class ValidadorDeSenha {
	
	
		public static boolean validadorLetras(String senha) {
			
			Boolean temMaiuscula = null;
			Boolean temMinuscula = null;
			Boolean temCaracter = null;
			
			if (senha.chars().anyMatch(Character::isUpperCase) && senha.chars().anyMatch(Character::isLowerCase)) {
				temMaiuscula = true;
				temMinuscula = true;
			} else {
				temMaiuscula = false;
				temMinuscula = false;
			}
			
			String[] caracteres = {"!", "@", "#", "$", "%", "&", "*", "(", ")", "-", "_"};
			
			for (int i = 0; i < caracteres.length; i++) {
				if (senha.contains(caracteres[i])) {
					temCaracter = true;
				} 
			}
			
			
			return temMaiuscula && temMinuscula && temCaracter ;
		}
	
	
	
	
}
